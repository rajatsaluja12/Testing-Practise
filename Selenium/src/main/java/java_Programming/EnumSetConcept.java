package java_Programming;

import java.util.EnumSet;
import java.util.Iterator;



public class EnumSetConcept {

	//It is non synchronized 
	//Its a highly performance java collection member 
	//faster than HashSet
	//all the methods are implemented using bitwise arithmetic operations 
	
	enum Lang{
		Java,
		CSharp,
		JavaScript,
		Python,
		Ruby,
	}
	
	public static void main(String[] args) {
		
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		//blank or null enumset or you say empty enumset
		
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);
		
		//range(e1,e2)
		EnumSet<Lang> enumRange = EnumSet.range(Lang.Java, Lang.Python);
		System.out.println(enumRange);
		
		//of :
		
		EnumSet<Lang> CsharpEnum = EnumSet.of(Lang.CSharp);
		System.out.println(CsharpEnum);
		
		EnumSet<Lang> MultipleEnum = EnumSet.of(Lang.Java,Lang.Ruby);
		System.out.println(MultipleEnum);
		
		
		//add and addAll
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JavaScript);
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		
		//How to iterate EnumSet : iterator :
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);	
		Iterator<Lang> it = fullLang.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(",");
		}
		
		
		//remove() and removeAll()
		EnumSet<Lang> newlang = EnumSet.allOf(Lang.class);	
		System.out.println(newlang);
		
		boolean b = newlang.remove(Lang.CSharp);
		System.out.println(b);
		System.out.println(newlang);
		
		boolean b1 = newlang.removeAll(newlang);
		System.out.println(b1);
		System.out.println(newlang);
	}

}
