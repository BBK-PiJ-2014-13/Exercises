
public class ArrayCopier {
	
	void copy(int[] src, int[] dst) {
		
		int numberIterate = 0;
		int scrSize = src.length;
		int dstSize = dst.length;
		
		if (scrSize > dstSize) {
			numberIterate = scrSize - dstSize;
		} else if (scrSize < dstSize) {
			numberIterate = dstSize - scrSize;
		} else {
			numberIterate = scrSize;
		}
		
		for (int i = 0; i < numberIterate; i++) {
			dst[i] = src[i];
		}
	}

}
