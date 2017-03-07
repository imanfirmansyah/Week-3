public class searchengine {
		public String nama;
		
		public void cariinformasi () {
			System.out.println("Cari Informasi");
		}
		
		public static void main (String[] args){
			searchengine Google = new searchengine();
		
			Google.nama = "Google";
			Google.cariinformasi();
			
			}
		
		}