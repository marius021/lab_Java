package com.Maurice;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortareCursuri implements Comparator<Curs>
{

    private static final List<Curs> Curs = null;
    private Curs[] cursuri;

    @Override
    public int compare(Curs o1, Curs o2)
    {

        return 0;
    }

    public void afisareCursuri()
    {
        cursuri = null;
        for(Curs c:cursuri)
        {
            System.out.println(c);
        }
    }

    public void sortareCursusriDupaNume()
    {
        if(getCurs().size()==0)
        {
            System.out.println("Lipsa cursuri");
            return;
        }

        Collections.sort(getCurs(),new Comparator<Curs>()
        {
            @Override
            public int compare(Curs c1, Curs c2)
            {
                if(c1.nume.compareTo(c2.nume)<0)
                {
                    return -1;
                }
                else if(c1.nume.compareTo(c2.nume)<0)
                {
                    return 1;
                }
                return 0;
            }
        });

    }

    public void sortareCursuriDupaProf()
    {
        if(getCurs().size()==0)
        {
            System.out.println("Lipsa cursuri");
            return;
        }

        Collections.sort(getCurs(),new Comparator<Curs>()
        {
            @Override
            public int compare(Curs c1, Curs c2)
            {
                if(c1.profu.nume.compareTo(c2.profu.nume)<0)
                {
                    return 1;
                }

                else if(c1.profu.nume.compareTo(c2.profu.nume)>0)
                {
                    return -1;
                }
                return 0;

            }
        });
    }

    public void sortareCursuriDupaNrStud()
    {
        if(getCurs().size()==0)
        {
            System.out.println("Lipsa cursuri");
            return;
        }

        extracted();
    }

    private void extracted() {
        Collections.sort(getCurs(),new Comparator<Curs>()
        {
            @Override
            public int compare(Curs c1, Curs c2)
            {
                if(c1.studenti.size()>c2.studenti.size())
                {
                    return -1;
                }
                else if (c1.studenti.size()<c2.studenti.size())
                {
                    return 1;
                }
                return 0;
            }
        });
    }

    public static List<Curs> getCurs() {
        return Curs;
    }
}
