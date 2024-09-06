package ticketSystem;
public class Movie {
	double getRate(){
		return 100;
	}
}
class TwoD extends Movie{
}
class ThreeD extends Movie{
	double getRate(){
		return 150;
	}
}
