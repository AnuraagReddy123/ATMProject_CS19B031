import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptPassword {
    
    private IvParameterSpec ivParameterSpec;
    private SecretKeySpec secretKeySpec;
    private Cipher cipher;
    
    private static final String SECRET_KEY_1 = "ssdkF$HUy2A#D%kd";
    private static final String SECRET_KEY_2 = "weJiSEvR5yAC5ftB";

    public EncryptPassword() throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException {
        ivParameterSpec = new IvParameterSpec(SECRET_KEY_1.getBytes("UTF-8"));
        secretKeySpec = new SecretKeySpec(SECRET_KEY_2.getBytes("UTF-8"), "AES");
        cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }


    public String encrypt(String toBeEncrypt) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(toBeEncrypt.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    /*
    private final static String ALGO = "AES/CBC/PKCS5Padding";
    
    public static String encryptPIN (String PIN) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        
        KeyGenerator key = KeyGenerator.getInstance("AES");
        key.init(128);
        
        SecretKeySpec sks = new SecretKeySpec("1234567891234567".getBytes(), "AES");
        
        byte[] bs = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(bs);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bs);
        
        Cipher cipher = Cipher.getInstance(ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, sks, ivParameterSpec);
        
        byte[] outputEncryption = Base64.getEncoder().encode(cipher.doFinal(PIN.getBytes()));
        
        return new String(outputEncryption);
    }
    */
}
