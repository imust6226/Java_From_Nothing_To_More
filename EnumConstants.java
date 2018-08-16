package enumConstant;

public class enumArray {

	enum constants{
		constants_A(100),
		constants_B("我是枚举成员constants_B"),
		constants_C("我是枚举成员constants_C"),
		constants_D(1000),
		constants_E;
		String description;
		int intOrdinal;
		private constants() {
			System.out.println("\n");
		}
		private constants(String description1) {
			this.description = description1;
		}
		private constants(int intOne) {
			this.intOrdinal = intOne+1;
		}
		public  String getDescription() {
			return this.description;
		}
		public int getIntOrdinal() {
			return this.intOrdinal;
		}
	}
	/*
	 *使用values()方法返回枚举型数组 */
	private static constants[] returnConstants(constants c) {
		return c.values();
		}
	//读出枚举成员
	public static void main(String [] args) {
	  constants [] con = constants.values();
		for(int i=0;i<con.length;i++) {
			System.out.println("第"+con[i].ordinal()+"个是\t"+con[i]);
		}
	
		//调用返回值为String类型的构造方法
		for(int j=0;j<con.length;j++) {
			System.out.println(con[j].getDescription());
		}

		//调用返回值为int类型的构造方法
		for(int l=0;l<con.length;l++) {
			System.out.println(con[l].getIntOrdinal());
		}
	}
}
