package io.bidmachine;

import com.explorestack.protobuf.adcom.Context;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class BlockedParams extends up.o implements up.g {
    private Set<String> blockedApplications;
    private Set<String> blockedCategories;
    private Set<String> blockedDomains;

    private <T> Set<T> updateList(Set<T> set, Set<T> set2) {
        if (set != null) {
            if (set2 == null) {
                return new HashSet(set);
            }
            set2.addAll(set);
        }
        return set2;
    }

    public void build(Context.Restrictions.Builder builder) {
        Set<String> set = this.blockedDomains;
        if (set != null) {
            builder.addAllBadv(set);
        }
        Set<String> set2 = this.blockedCategories;
        if (set2 != null) {
            builder.addAllBcat(set2);
        }
        Set<String> set3 = this.blockedApplications;
        if (set3 != null) {
            builder.addAllBapp(set3);
        }
    }

    @Override // up.g
    public BlockedParams addBlockedAdvertiserDomain(String str) {
        if (this.blockedDomains == null) {
            this.blockedDomains = new HashSet();
        }
        this.blockedDomains.add(str);
        return this;
    }

    @Override // up.g
    public BlockedParams addBlockedAdvertiserIABCategory(String str) {
        if (this.blockedCategories == null) {
            this.blockedCategories = new HashSet();
        }
        this.blockedCategories.add(str);
        return this;
    }

    @Override // up.g
    public BlockedParams addBlockedApplication(String str) {
        if (this.blockedApplications == null) {
            this.blockedApplications = new HashSet();
        }
        this.blockedApplications.add(str);
        return this;
    }

    @Override // up.o
    public void merge(BlockedParams blockedParams) {
        this.blockedDomains = updateList(blockedParams.blockedDomains, this.blockedDomains);
        this.blockedCategories = updateList(blockedParams.blockedCategories, this.blockedCategories);
        this.blockedApplications = updateList(blockedParams.blockedApplications, this.blockedApplications);
    }
}
