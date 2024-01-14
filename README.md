# Image Encryption Java Program

## Overview
This Java program provides a graphical user interface (GUI) for image encryption using a basic XOR encryption algorithm. The GUI, built with Java Swing, allows users to open an image file, input an encryption key, and execute the encryption operation.

## Instructions for Use
### Run the Program:
1. Compile and run the `imgEncryption.java` file.
2. The GUI window titled "Image Encryption" will appear.

### Interface Elements:
- **Open Image Button:** Click to open a file chooser dialog and select an image file.
- **Text Field:** Enter a numerical key for encryption or decryption.

### Performing Encryption:
1. After selecting an image file and entering an encryption key, click the "Open Image" button.
2. The program reads the contents of the selected image file, performs **encryption using XOR encryption** with the specified key, and overwrites the original file with the encrypted data.

### Performing Decryption:
1. To decrypt an already encrypted image, follow the same steps as encryption but provide the same key used for encryption.
2. The program will read the contents of the encrypted image file, perform decryption using XOR encryption with the specified key, and overwrite the encrypted file with the original data.

### Output:
- Byte values before and after encryption/decryption will be printed in the console.
- A dialog will appear with the message `Done` to signify the completion of the encryption or decryption operation.

## Important Notes
- This program utilizes a **basic XOR encryption algorithm** for educational purposes and may not offer robust security.
- Ensure the entered key is a valid integer.
- Exercise caution when overwriting original image files, as the encryption process is irreversible.

## Example Usage
1. Open the program.
2. Click `Open Image`, enter the numerical key, and select an image file.
3. Click `Open Image` to encrypt the image.
4. To decrypt the image, follow the same steps, providing the same key used for encryption.
5. Check the console for byte values before and after encryption or decryption.
6. A dialog will confirm the completion of the encryption or decryption process.
