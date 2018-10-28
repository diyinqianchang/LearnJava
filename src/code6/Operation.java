package code6;

public enum Operation {
	
	PLUS{
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x+y;
		}
	},
	MINUS{
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	},
	TIMES{
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x*y;
		}
	},
	DIVIDE{
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	};
	
	public abstract double eval(double x,double y);
	public static void main(String[] args) {
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(3, 4));
		System.gc();
	}

}
