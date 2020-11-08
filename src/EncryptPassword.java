import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class EncryptPassword {
    
    private final static String ALGO = "AES/CBC/PKCS5Padding";
    
    public static String encryptPIN (String PIN) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        
        KeyGenerator key = KeyGenerator.getInstance("AES");
        key.init(128);
        SecretKey secretKey = key.generateKey();
        
        byte[] bs = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(bs);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bs);
        
        Cipher cipher = Cipher.getInstance(ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
        
        byte[] outputEncryption = Base64.getEncoder().encode(cipher.doFinal(PIN.getBytes()));
        
        return new String(outputEncryption);
    }
}
