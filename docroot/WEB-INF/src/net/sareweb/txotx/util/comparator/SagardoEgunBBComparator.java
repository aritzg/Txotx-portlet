package net.sareweb.txotx.util.comparator;

import net.sareweb.txotx.model.SagardoEgun;

import com.liferay.portal.kernel.util.OrderByComparator;

public class SagardoEgunBBComparator extends OrderByComparator {

	
	public static final String ORDER_BY_ASC = "Txotx_SagardoEgun.balorazioenBB ASC, Txotx_SagardoEgun.irudiKopurua ASC";
    
    public static final String ORDER_BY_DESC = "Txotx_SagardoEgun.balorazioenBB DESC, Txotx_SagardoEgun.irudiKopurua DESC";

    public static final String[] ORDER_BY_FIELDS = {"balorazioenBB", "irudiKopurua"};

    public SagardoEgunBBComparator() {
            this(false);
    }

    public SagardoEgunBBComparator(boolean ascending) {
            _ascending = ascending;
    }

    @Override
    public int compare(Object obj1, Object obj2) {
    	SagardoEgun sagardoEgun1 = (SagardoEgun)obj1;
    	SagardoEgun sagardoEgun2 = (SagardoEgun)obj2;

           int value = 0;
           
           if(sagardoEgun1.getBalorazioenBB() < sagardoEgun2.getBalorazioenBB()){
        	   value = -1;
           }
           else if(sagardoEgun1.getBalorazioenBB() == sagardoEgun2.getBalorazioenBB()){
        	   if(sagardoEgun1.getIrudiKopurua() < sagardoEgun2.getIrudiKopurua())value = -1;
        	   else value=1;
           }
           else {
        	   value = 1;
           }

            if (_ascending) {
                    return value;
            }
            else {
                    return -value;
            }
    }

    @Override
    public String getOrderBy() {
            if (_ascending) {
                    return ORDER_BY_ASC;
            }
            else {
                    return ORDER_BY_DESC;
            }
    }

    @Override
    public String[] getOrderByFields() {
            return ORDER_BY_FIELDS;
    }

    @Override
    public boolean isAscending() {
            return _ascending;
    }

    private boolean _ascending;

}
