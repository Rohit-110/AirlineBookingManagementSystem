
public class flightdetails {
    String Fid;
    String Fnme;
    String Fdes;
    String For;
    String Fddate;
    String Fadate;
    String Fdtime;
    String Fatime;
     String Fcp;
     String Ftpe;
     String Fpce;
     
    flightdetails(String id,String nme,String des,String or,String ddate,String adate,String dtime,String atime, String cp,String tpe,String pce)
    {
        Fid=id;
        Fadate=adate;
        Ftpe=tpe;
        Fdes=des;
        For=or;
        Fnme=nme;
        Fddate=ddate;
        Fatime=atime;
        Fdtime=dtime;
        Fcp=cp;
        Fpce=pce;
    }
   
}
