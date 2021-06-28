package com.company.task3.comparator;

import com.company.task3.entity.Cone;

import java.util.Comparator;

public enum ConeComparator implements Comparator<Cone> {
    ID {
        @Override
        public int compare(Cone o1, Cone o2) {
            return Long.compare(o1.getConeId(), o2.getConeId());
        }
    },
    POINT {
        @Override
        public int compare(Cone o1, Cone o2) {
            int result = Double.compare(o1.getBase().getX(), o2.getBase().getX()) +
                    Double.compare(o1.getBase().getY(), o2.getBase().getY()) +
                    Double.compare(o1.getBase().getZ(), o2.getBase().getZ());
            return result;
        }
    },
    RADIUS {
        @Override
        public int compare(Cone o1, Cone o2) {
            return Double.compare(o1.getRadius(), o2.getRadius());
        }
    },
    HEIGHT {
        @Override
        public int compare(Cone o1, Cone o2) {
            return Double.compare(o1.getHeight(), o2.getHeight());
        }
    },
/*    SURFACE_AREA{
        @Override
        public int compare(Cone o1, Cone o2) {
            return Double.compare(o1.,o2.getHeight());
        }
    },
    GENERATRIX_LENGTH;*/
}
