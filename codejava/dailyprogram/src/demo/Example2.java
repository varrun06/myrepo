package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pvc{

	private String pvccode;
	private String pvcdesc;

	public String getPvccode() {
		return pvccode;
	}
	public void setPvccode(String pvccode) {
		this.pvccode = pvccode;
	}
	public String getPvcdesc() {
		return pvcdesc;
	}
	public void setPvcdesc(String pvcdesc) {
		this.pvcdesc = pvcdesc;
	}
}

class Goms{

	private String gomscode;

	public String getGomscode() {
		return gomscode;
	}

	public void setGomscode(String gomscode) {
		this.gomscode = gomscode;
	}

}

class Pvcgoms{

	private String pvccode;
	private String pvcdesc;
	private String gomscode;

	public String getPvccode() {
		return pvccode;
	}
	public void setPvccode(String pvccode) {
		this.pvccode = pvccode;
	}
	public String getPvcdesc() {
		return pvcdesc;
	}
	public void setPvcdesc(String pvcdesc) {
		this.pvcdesc = pvcdesc;
	}
	public String getGomscode() {
		return gomscode;
	}
	public void setGomscode(String gomscode) {
		this.gomscode = gomscode;
	}

}

public class Example2 {


	private ArrayList<Pvc> pvcList;

	public ArrayList<Pvc> getPvcList() {
		return pvcList;
	}
	public void setPvcList(ArrayList<Pvc> pvcList) {
		this.pvcList = pvcList;
	}

	public void addpvc(String pvccode , String pvcdesc) {

		if(getPvcList() == null) {
			setPvcList(new ArrayList<Pvc>());
		}
		Pvc pObj = new Pvc();
		pObj.setPvccode(pvccode);
		pObj.setPvcdesc(pvcdesc);
		pvcList.add(pObj);

	}

	private ArrayList<Goms> gomsList;

	public ArrayList<Goms> getGomsList() {
		return gomsList;
	}
	public void setGomsList(ArrayList<Goms> gomsList) {
		this.gomsList = gomsList;
	}

	public void addgoms(String gomscode) {

		if(getGomsList() == null) {
			setGomsList(new ArrayList<Goms>());
		}
		Goms gObj = new Goms();
		gObj.setGomscode(gomscode);

		gomsList.add(gObj);

	}

	private ArrayList<Pvcgoms> pvcgomsList = new ArrayList();

	public ArrayList<Pvcgoms> getPvcgomsList() {
		return pvcgomsList;
	}
	public void setPvcgomsList(ArrayList<Pvcgoms> pvcgomsList) {
		this.pvcgomsList = pvcgomsList;
	}
	public void addpvcgoms(String gomscode,String pvccode , String pvcdesc) {

		if(getPvcgomsList() == null) {
			setPvcgomsList(new ArrayList<Pvcgoms>());
		}

		Pvcgoms pgObj = new Pvcgoms();
		pgObj.setGomscode(gomscode);
		pgObj.setPvccode(pvccode);
		pgObj.setPvccode(pvcdesc);

		pvcgomsList.add(pgObj);
	}

	public static void main(String[] args) {

		Example2 pgobj = new Example2();

		pgobj.addgoms("g1");
		pgobj.addgoms("g2");
		pgobj.addgoms("g3");
		pgobj.addpvc("p1", "d1");
		pgobj.addpvc("p2", "d2");
		pgobj.addpvc("p3", "d3");

		for(int i=0;i<3;i++) {
			Pvc p = pgobj.pvcList.get(i);
			for(int j=0;j<3;j++){
				Goms g  = pgobj.gomsList.get(j);
				Pvcgoms pvcgoms = new Pvcgoms();
				pvcgoms.setGomscode(g.getGomscode());
				pvcgoms.setPvccode(p.getPvccode());
				pvcgoms.setPvcdesc(p.getPvcdesc());
				pgobj.pvcgomsList.add(pvcgoms);
			}
		}
		
		for(int index =0; index<pgobj.pvcgomsList.size(); index++) {
			System.out.println(" code is "+ pgobj.pvcgomsList.get(index).getGomscode()
					
					+ " pvc code " + pgobj.pvcgomsList.get(index).getPvccode()
					+ " pvc desc "+ pgobj.pvcgomsList.get(index).getPvcdesc());
		}
	}	
}