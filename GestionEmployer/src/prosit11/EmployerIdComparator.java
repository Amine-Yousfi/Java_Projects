package prosit11;

import prosit9.Employer;

import java.util.Comparator;

public class EmployerIdComparator implements Comparator<Employer> {
    @Override
    public int compare(Employer e1, Employer e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}
