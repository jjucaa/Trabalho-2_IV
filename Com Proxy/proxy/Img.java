package proxy;

import java.util.concurrent.TimeUnit;

public class Img implements Ascii {

@SuppressWarnings("unused")
private String ascii;
	
	public Img(String ascii) {
		this.ascii = ascii;
		carregandoImagem(ascii);
	}

	@Override
	public void print() {
		System.out.println("Ascii carregado: \n"
				+ "                             ,\r\n"
				+ "                             B\r\n"
				+ "                            BMB.\r\n"
				+ "                          3BBBMBX\r\n"
				+ "                       .PMBMBMBMBBD,\r\n"
				+ "                     7MBMBMBMBMBMBMBMs\r\n"
				+ "                  :EBMBMBMBMx iMBMBMBMBO:\r\n"
				+ "                7BMBMBBBMBJ     vBBBBBMBMBs\r\n"
				+ "              xMBMBBBMBH,    .    .UBMBMBMBBF\r\n"
				+ " .          .BMBBBMBX:      :Br      .FBMBMBBB:\r\n"
				+ " LR;,.:rUOBMBMBMBM;       ;MBMBBr       :OBMBMBBBRSr:.,:EU\r\n"
				+ "  MBMBMBBBMBMBMM.      :0BMBBEMBMBD:       WMBBBMBMBMBMBM\r\n"
				+ "  HMB.::.  BBMc     .HBMBMBK   FBBBMBZ,     ;BBB  .::.BBM\r\n"
				+ "  MBM      UMP    .BMBMBZ:       ,HBMBMB:    LBM      MBM\r\n"
				+ "  BBB   BMBMBr   cBMBW:     0BM     .0BMBF   .BMBMB   BMB:\r\n"
				+ " WBBx   cBL.iB   BMR     cMBM1MBM3     PMB   M7,;BK   ;BMB\r\n"
				+ "  MBM    BM:  .J  BB    RBMB;   :RMBM    RM  c:   MB    MBM\r\n"
				+ ":BM7    BB     , ,M   MBr         ;BM   Or .     BM:   :MBi\r\n"
				+ ":MB,   7B7        .i  B             B  ::        :BS    BM\r\n"
				+ " BMG    BK             :           .,            cM:   2MB\r\n"
				+ "  BMH   .Mi     : :                 E:          :M:   sMB\r\n"
				+ "   ;MRui  ;:.   :Fui:;  :;;7i   .;;;rS:,  rr   ,:  :7EO:\r\n"
				+ "        ::::::,   .UUi:77;::37s7Lv7;  ,;3SD,....:;;,\r\n"
				+ "     BM: ..:i7rJLxS:  .      rs: 7   ..;LxxUWRFU;::7OW\r\n"
				+ "      S2r:::iis0r;J3Or.:rvLi:::rBL.  .:;,  .   :ri:.,\r\n"
				+ "                    .ZL. .:L;,r7;i7r;7:\r\n"
				+ "                            xMc     ,\r\n"
				+ "                           :. 3v\r\n"
				+ "                           :S  ;\r\n"
				+ "                            LB;\r\n"
				+ "                             7");
	}
	
	private void carregandoImagem(String ascii) {
		System.out.println("Carregando Ascii " + ascii + " ....\n");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
