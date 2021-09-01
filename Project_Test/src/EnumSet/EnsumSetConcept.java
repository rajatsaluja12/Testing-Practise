package EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnsumSetConcept {

	//it is not syncronized
	// high performance
	//faster than hashset
	// all the methods are implemented using bitwise airthmetic operations



	enum Lang{
		JAVA,
		PYTHON,
		CSHARP,
		RUBY,
		JAVASCRIPT

	}

	public static void main(String[] args) {

		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);

		// printing anti enum - empty enumset creation

		EnumSet<Lang> en1= EnumSet.noneOf(Lang.class);

		System.out.println(en1);

		// printing the enumset in range

		EnumSet<Lang> en2= EnumSet.range(Lang.JAVA, Lang.RUBY);
		System.out.println(en2);

		// of method - single enum
		EnumSet<Lang> en3=EnumSet.of(Lang.PYTHON);
		System.out.println(en3);


		// of method - EnumSet with multiple values
		EnumSet<Lang> en4=EnumSet.of(Lang.PYTHON,Lang.RUBY);
		System.out.println(en4);

		// add all method test
		EnumSet<Lang> langs1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> en11= EnumSet.noneOf(Lang.class);

		en11.add(Lang.PYTHON);
		langs1.addAll(en11);
		System.out.println(langs1);

		// how to iterate enumSet

		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);

		Iterator<Lang> it = fullLang.iterator();

		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" , ");
		}
		// how to remove
		EnumSet<Lang> fullLang1 = EnumSet.allOf(Lang.class);
		boolean b = fullLang1.remove(Lang.PYTHON);
		System.out.println(b);
		System.out.println(fullLang1);




	}

}
