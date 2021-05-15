/*							
 *  Copyright(C) 2005,  FPT University							
 *  Lab Java Web:							
 *      Photographer	
 *							
 *  Record of change:							
 *  DATE                       Version             AUTHOR                       DESCRIPTION							
 *  2021-02-20                   1.0               TungDT                      First Implement
 */
package dao;

/**
 * This interface class contain some method used to implements in another class
 *
 * @author Dương Thanh Tùng
 */
public interface ViewsDAO {

    /**
     * This method used to get views from Views table
     *
     * @return count: Total views
     * @throws Exception
     */
    public int getViews() throws Exception;

    /**
     * This method used to update(add views by 1) to Views table
     *
     * @throws Exception
     */
    public void UpdateViews() throws Exception;
}
