// public class HelloWorld {
//  public static void main(String[] args) {
//   System.out.println("Hello World")
//   }
// }
// class HelloWorld{
//     static void main(args){
//         println "Hello"
//     }
// }
// def value = 12.0
// println value.class
// def bol = true
// println bol.class

// def repeat(val){
//     for(i in 0..<5){
//         println val
//     }
// }



//repeat("Hello World")
class HelloWorld{
    static void main(args){
      /*  def range = 0..5
        println range.class
        assert range instanceof List
        def coll = ["Groovy","Java","Ruby"]
        assert coll instanceof Collection
        assert coll instanceof ArrayList
        coll.add("python")
        coll<< "Smalltalk"
        coll[5] = "Perl"
        println coll*/
       /* def numbers = [1,2,3,4]
        assert numbers.join(",") == "1,2,3,4"
        println numbers
        println numbers.join(",")
        println numbers.count(2)
        println "python"*.toUpperCase()
        def arr = ["Java", "Groovy"]*.toUpperCase()
        println arr[1]
        def hash = [name:"Andy", "VPN-#":45]
        hash.put("id",89)
        hash.dob = "01/29/76"
        println hash */
        
        def acoll = ["Groovy", "Java", "Ruby"]
	/*	for(Iterator iter = acoll.iterator(); iter.hasNext();){
		    println iter.next()
		    
		}
		acoll.each{ value ->
		    println "${value}!!"
		}*/
	/*	"ITERATION".each{
		    println it.toLowerCase()
		    
		}*/
		
		def sng = new Song(name:"Le Freak",artist:"Chic",genre:"Disco")
		sng.setGenre("Disco_version2")
		assert sng.artist == "Chic"
		println sng
    }
}


class Song{
    def name
    def artist
    def genre
    String toString(){
        name +" ,"+ artist+" "+genre
        //"${name}, ${artist}, ${genre}"
    }
}




