package Verein.VereinsMitgliedPackage;


/**
* Verein/VereinsMitgliedPackage/VereinSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from vmitglied.idl
* Sonntag, 21. Mai 2017 11:54 Uhr MESZ
*/

public final class VereinSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public Verein.VereinsMitgliedPackage.verein value[] = null;

  public VereinSeqHolder ()
  {
  }

  public VereinSeqHolder (Verein.VereinsMitgliedPackage.verein[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Verein.VereinsMitgliedPackage.VereinSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Verein.VereinsMitgliedPackage.VereinSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Verein.VereinsMitgliedPackage.VereinSeqHelper.type ();
  }

}
