package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.Init;
import org.junit.Test;


public class SearchTest extends Init {

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void search() {
        String searchText = "necklace";
        searchSteps.searchProduct(searchText);
        searchSteps.checkMatchSearch(searchText);
    }



}
