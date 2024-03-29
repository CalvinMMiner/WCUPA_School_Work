import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<CarElement> list = new ArrayList<CarElement>();
		list.add( new Body()   );
		list.add( new Engine() );
		list.add( new Wheel()  );

		for (CarElement e : list) 
		{
			e.accept( RepairVisitor.getinstance()   );
			e.accept( PurchaseVisitor.getinstance() );
			e.accept( PaintVisitor.getinstance()    );
		}
	}
}
