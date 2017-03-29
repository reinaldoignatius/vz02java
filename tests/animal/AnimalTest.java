package animal;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma & Reinaldo Ignatius Wijaya
 */
public class AnimalTest extends TestCase {
  public void testGetId() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetId().equals("WF"));
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetId().equals("LI"));
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetId().equals("ZBR"));
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetId().equals("ELP"));
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetId().equals("MCQ"));
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetId().equals("HG"));
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetId().equals("SHK"));
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetId().equals("MRE"));
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetId().equals("DGG"));
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetId().equals("TRL"));
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetId().equals("DLP"));
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetId().equals("WHL"));
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetId().equals("EGL"));
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetId().equals("OW"));
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetId().equals("HMB"));
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetId().equals("CKT"));
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetId().equals("RBN"));
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetId().equals("BT"));
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetId().equals("PNG"));
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetId().equals("HPP"));
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetId().equals("PLC"));
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetId().equals("GSE"));
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetId().equals("CRN"));
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetId().equals("DRL"));
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetId().equals("CLG"));
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetId().equals("SGL"));
  }

  public void testGetWeight() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetWeight() == 45);
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetWeight() == 158);
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetWeight() == 226);
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetWeight() == 5000);
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetWeight() == 9);
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetWeight() == 68);
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetWeight() == 771);
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetWeight() == 13);
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetWeight() == 294);
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetWeight() == 453);
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetWeight() == 220);
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetWeight() == 40000);
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetWeight() == 4);
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetWeight() == 2);
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetWeight() == 0.0002);
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetWeight() == 0.09);
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetWeight() == 0.06);
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetWeight() == 0.15);
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetWeight() == 22);
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetWeight() == 1496);
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetWeight() == 7);
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetWeight() == 4);
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetWeight() == 3);
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetWeight() == 0.2);
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetWeight() == 0.035);
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetWeight() == 0.12);
    a = new Animal("SGL", 100.213, new Pair(3, 3));
    assert (a.GetWeight() == 100.213);
  }

  public void testGetEat() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetEat() == 0.5);
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetEat() == 0.7);
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetEat() == 0.05);
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetEat() == 0.1);
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetEat() == 0.7);
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetEat() == 0.4);
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetEat() == 0.25);
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetEat() == 0.65);
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetEat() == 0.25);
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetEat() == 0.5);
  }

  public void testGetPos() throws Exception {
    Animal a = new Animal("SGL", new Pair(2, 3));
    assert (a.GetPos().Equals(new Pair(2, 3)));
  }

  public void testGetType() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetType() == 'O');
  }

  public void testGetLegend() throws Exception {
	  Animal a;
	  a = new Animal ("WF", new Pair(0, 0));
	  assert(a.GetLegend() == '1');
	  a = new Animal ("LI", new Pair(0, 0));
	  assert(a.GetLegend() == '2');
	  a = new Animal ("ZBR", new Pair(0, 0));
	  assert(a.GetLegend() == '3');
	  a = new Animal ("ELP", new Pair(0, 0));
	  assert(a.GetLegend() == '4');
	  a = new Animal ("MCQ", new Pair(0, 0));
	  assert(a.GetLegend() == '5');
	  a = new Animal ("HG", new Pair(0, 0));
	  assert(a.GetLegend() == '6');
	  a = new Animal ("SHK", new Pair(0, 0));
	  assert(a.GetLegend() == '7');
	  a = new Animal ("MRE", new Pair(0, 0));
	  assert(a.GetLegend() == '8');
	  a = new Animal ("DGG", new Pair(0, 0));
	  assert(a.GetLegend() == '9');
	  a = new Animal ("TRL", new Pair(0, 0));
	  assert(a.GetLegend() == '0');
	  a = new Animal ("DLP", new Pair(0, 0));
	  assert(a.GetLegend() == '!');
	  a = new Animal ("WHL", new Pair(0, 0));
	  assert(a.GetLegend() == '@');
	  a = new Animal ("EGL", new Pair(0, 0));
	  assert(a.GetLegend() == '#');
	  a = new Animal ("OW", new Pair(0, 0));
	  assert(a.GetLegend() == '$');
	  a = new Animal ("HMB", new Pair(0, 0));
	  assert(a.GetLegend() == '%');
	  a = new Animal ("CKT", new Pair(0, 0));
	  assert(a.GetLegend() == '^');
	  a = new Animal ("RBN", new Pair(0, 0));
	  assert(a.GetLegend() == '&');
	  a = new Animal ("BT", new Pair(0, 0));
	  assert(a.GetLegend() == '*');
	  a = new Animal ("PNG", new Pair(0, 0));
	  assert(a.GetLegend() == '(');
	  a = new Animal ("HPP", new Pair(0, 0));
	  assert(a.GetLegend() == ')');
	  a = new Animal ("PLC", new Pair(0, 0));
	  assert(a.GetLegend() == '`');
	  a = new Animal ("GSE", new Pair(0, 0));
	  assert(a.GetLegend() == '+');
	  a = new Animal ("CRN", new Pair(0, 0));
	  assert(a.GetLegend() == '-');
	  a = new Animal ("DRL", new Pair(0, 0));
	  assert(a.GetLegend() == '=');
	  a = new Animal ("CLG", new Pair(0, 0));
	  assert(a.GetLegend() == '<');
	  a = new Animal ("SGL", new Pair(0, 0));
	  assert(a.GetLegend() == '>');
  }

  public void testGetHabitat() throws Exception {
    Animal a;
    HashSet<Character> habitat;
    a = new Animal("WF", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("LI", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("ZBR", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("ELP", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("MCQ", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("HG", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("SHK", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("MRE", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("DGG", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("TRL", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("DLP", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("WHL", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("EGL", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("OW", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("HMB", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("CKT", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("RBN", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("BT", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("PNG", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("HPP", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    habitat.add(new Character('W'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("PLC", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("GSE", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("CRN", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('W'));
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("DRL", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("CLG", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));
    a = new Animal("SGL", new Pair(0, 0));
    habitat = new HashSet<Character>();
    habitat.add(new Character('L'));
    habitat.add(new Character('A'));
    assert (a.GetHabitat().equals(habitat));

  }

  public void testGetCompatible() throws Exception {
	  Animal a;
	  HashSet<String> compatible;
	  a = new Animal ("WF", new Pair(0, 0));
  	compatible = new HashSet<String>();
	  compatible.add(new String("WF"));
	  compatible.add(new String("ELP"));
	  compatible.add(new String("HPP"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("LI", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("LI"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("ZBR", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("ELP"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("DRL"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("ELP", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("WF"));
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("ELP"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("MCQ", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("ELP"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("DRL"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("HG", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("ELP"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("HPP"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("SHK", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("SHK"));
	  compatible.add(new String("WHL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("MRE", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("HPP"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("DGG", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("TRL", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("DLP", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("WHL", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("SHK"));
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("EGL", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("EGL"));
	  compatible.add(new String("OW"));
	  compatible.add(new String("PLC"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("OW", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("EGL"));
	  compatible.add(new String("OW"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("DRL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("HMB", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("CKT", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  compatible.add(new String("CLG"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("RBN", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("DRL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("BT", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("PNG", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("ELP"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("DRL"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("HPP", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("WF"));
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("ELP"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("PLC", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  compatible.add(new String("EGL"));
	  compatible.add(new String("OW"));
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("GSE", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("CRN", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("MRE"));
	  compatible.add(new String("DGG"));
	  compatible.add(new String("TRL"));
	  compatible.add(new String("DLP"));
	  compatible.add(new String("WHL"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("DRL"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("DRL", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("DRL"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  compatible.add(new String("OW"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("CLG", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("HPP"));
	  compatible.add(new String("DRL"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
	  a = new Animal ("SGL", new Pair(0, 0));
	  compatible = new HashSet<String>();
	  compatible.add(new String("ZBR"));
	  compatible.add(new String("MCQ"));
	  compatible.add(new String("HG"));
	  compatible.add(new String("PNG"));
	  compatible.add(new String("DRL"));
	  compatible.add(new String("CLG"));
	  compatible.add(new String("SGL"));
	  compatible.add(new String("HMB"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(a.GetCompatible().equals(compatible));
  }

  public void testMove() throws Exception {
		Animal a= new Animal ("WF", new Pair(0, 0));
		a.Move(0);
		assert(a.GetPos().first == -1 && a.GetPos().second == 0);
		a.Move(1);
		assert(a.GetPos().first == -1 && a.GetPos().second == -1);
		a.Move(2);
		assert(a.GetPos().first == -1 && a.GetPos().second == 0);
		a.Move(3);
		assert(a.GetPos().first == 0 && a.GetPos().second == 0);
  }

}