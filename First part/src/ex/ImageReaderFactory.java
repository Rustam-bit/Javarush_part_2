package src.ex;

import src.ex.common.*;

import static src.ex.common.ImageTypes.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes x){
        Object t = null;
        if(x == BMP){
            t = new BmpReader();
        }else if(x == JPG){
            t = new JpgReader();
        }else if(x == PNG){
            t = new PngReader();
        }
        if(t == null){
            throw new IllegalArgumentException();
        }
        return (ImageReader) t;
    }
}
