package com.statravel.autoqa.page;

import org.springframework.stereotype.Service;


/**
 * 
 * @author STA Development Team
 *
 */
@Service
public class TestPage extends Page<TestPageElements> {

    private TestPageElements loginPageElements;

    /*
     * (non-Javadoc)
     * 
     * @see com.statravel.autoqa.page.Page#init()
     */
    @Override
    public void init() {

        loginPageElements = new TestPageElements();

        super.initialiseElements(loginPageElements);

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.statravel.autoqa.page.Page#getPageElements()
     */
    @Override
    public TestPageElements getPageElements() {

        return loginPageElements;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.statravel.autoqa.page.Page#isPageLoaded()
     */
    @Override
    public boolean isPageLoaded() {

       return true;

    }


}
