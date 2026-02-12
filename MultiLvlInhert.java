public class MultiLvlInhert{
	public static void main(String[] args){

		Area ans = new Area();
		
		System.out.println(ans.div(27,21));

}
}

class Operation{

	public float add(float a, float b){
		return a+b;}

	public float sub(float a, float b){
		return a-b;}

	public float prod(float a, float b){
		return a*b;}

	public float div(float a, float b){
		return a/b;}

	
}

class SplFun extends Operation{

	public float sq(float a){

		return a*a; }

	public float cub(float a){

		return a*a*a; }

	public double sqrt(float a){

		return Math.sqrt(a);}

}

class Area extends SplFun{
	
	public double circum(float r){

		return Math.PI*2*r;}

	public double Area_Circle(float r){
		return Math.PI*r*r;}

	public float Area(float a, float b){
		return a*b;}

	public float Peri_sq(float a){
		return 4*a;}

	public float Peri_rect(float a, float b){
		return 2*(a+b);}
}
