package org.appledash.saneeconomy.economy.economable;

/**
 * Created by appledash on 7/19/16.
 * Blackjack is still best pony.
 */
public class EconomableGeneric implements Economable {
    private final String uniqueIdentifier;

    public EconomableGeneric(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    @Override
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    @Override
    public String getName() {
        return this.uniqueIdentifier.substring(16); // FIXME: Why 16?
    }
}
