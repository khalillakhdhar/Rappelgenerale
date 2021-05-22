package classes.collections;

import java.util.ArrayList;

import classes.Outcome;

public class Outcomes {
static ArrayList<Outcome> outs=new ArrayList<Outcome>();
static void add(Outcome out)
{
outs.add(out);

}
static void readall()
{
for(Outcome out : outs)
{
	
System.out.println(out.toString());
}


}
}
