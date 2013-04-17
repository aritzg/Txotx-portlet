package net.sareweb.txotx.util.comparator;

import net.sareweb.txotx.model.Sagardotegi;

import com.liferay.portal.kernel.util.OrderByComparator;

public class SagardotegiBBComparator extends OrderByComparator {

	
	public static final String ORDER_BY_ASC = "Txotx_Sagardotegi.balorazioenBB ASC, Txotx_Sagardotegi.irudiKopurua ASC";
    
    public static final String ORDER_BY_DESC = "Txotx_Sagardotegi.balorazioenBB DESC, Txotx_Sagardotegi.irudiKopurua DESC";

    public static final String[] ORDER_BY_FIELDS = {"balorazioenBB", "irudiKopurua"};

    public SagardotegiBBComparator() {
            this(false);
    }

    public SagardotegiBBComparator(boolean ascending) {
            _ascending = ascending;
    }

    @Override
    public int compare(Object obj1, Object obj2) {
    	Sagardotegi sagardotegi1 = (Sagardotegi)obj1;
    	Sagardotegi sagardotegi2 = (Sagardotegi)obj2;

           int value = 0;
           
           if(sagardotegi1.getBalorazioenBB() < sagardotegi2.getBalorazioenBB()){
        	   value = -1;
           }
           else if(sagardotegi1.getBalorazioenBB() == sagardotegi2.getBalorazioenBB()){
        	   if(sagardotegi1.getIrudiKopurua() < sagardotegi2.getIrudiKopurua())value = -1;
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
