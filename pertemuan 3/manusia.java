public class manusia{
	public static void  main(String[]args){ //main method
		manusia orang=new manusia(); //Menciptakan object orang
		orang.setNama("Azzah Firdaningsih");
		System.out.print("Namaku adalah="+orang.getNama());
	}
	
	public void setNama(String namaku){ //Method berparameter
		this.nama=namaku;
		}
		public String getNama(){
			return this.nama;
		}
	}
	
	
	
	
	
	
	
	
	