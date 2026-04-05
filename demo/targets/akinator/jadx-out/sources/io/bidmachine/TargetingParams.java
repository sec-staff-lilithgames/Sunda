package io.bidmachine;

import android.location.Location;
import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.App;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class TargetingParams extends up.o implements up.l {
    static final String DATA_ID_EXTERNAL_USER_ID = "external_user_ids";
    private Integer birthdayYear;
    private BlockedParams blockedParams;
    private String city;
    private String country;
    private Location deviceLocation;
    private List<ExternalUserId> externalUserIdList;
    private String framework;
    private pr.e gender;
    private Boolean isPaid;
    private String[] keywords;
    private String storeCategory;
    private String[] storeSubCategories;
    private String storeUrl;
    private String userId;
    private String zip;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fillAppExtension$0(App.Builder builder, String[] strArr) {
        for (String str : strArr) {
            builder.addStoresubcat(str);
        }
    }

    private void prepareBlockParams() {
        if (this.blockedParams == null) {
            this.blockedParams = new BlockedParams();
        }
    }

    public void build(Context.App.Builder builder) {
        String str = this.storeUrl;
        if (str != null) {
            builder.setStoreurl(str);
        }
        Boolean bool = this.isPaid;
        builder.setPaid(bool != null && bool.booleanValue());
    }

    public void fillAppExtension(final App.Builder builder) {
        String str = this.storeCategory;
        Objects.requireNonNull(builder);
        final int i10 = 0;
        nm.j.ifNotNull(str, new Executable() { // from class: io.bidmachine.d4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i10) {
                    case 0:
                        builder.setStorecat((String) obj);
                        break;
                    case 1:
                        TargetingParams.lambda$fillAppExtension$0(builder, (String[]) obj);
                        break;
                    default:
                        builder.setFmwname((String) obj);
                        break;
                }
            }
        });
        final int i11 = 1;
        nm.j.ifNotNull(this.storeSubCategories, new Executable() { // from class: io.bidmachine.d4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i11) {
                    case 0:
                        builder.setStorecat((String) obj);
                        break;
                    case 1:
                        TargetingParams.lambda$fillAppExtension$0(builder, (String[]) obj);
                        break;
                    default:
                        builder.setFmwname((String) obj);
                        break;
                }
            }
        });
        final int i12 = 2;
        nm.j.ifNotNull(this.framework, new Executable() { // from class: io.bidmachine.d4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i12) {
                    case 0:
                        builder.setStorecat((String) obj);
                        break;
                    case 1:
                        TargetingParams.lambda$fillAppExtension$0(builder, (String[]) obj);
                        break;
                    default:
                        builder.setFmwname((String) obj);
                        break;
                }
            }
        });
    }

    public Integer getBirthdayYear() {
        return this.birthdayYear;
    }

    public BlockedParams getBlockedParams() {
        return this.blockedParams;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public Location getDeviceLocation() {
        return this.deviceLocation;
    }

    public List<ExternalUserId> getExternalUserIdList() {
        return this.externalUserIdList;
    }

    public String getFramework() {
        return this.framework;
    }

    public pr.e getGender() {
        return this.gender;
    }

    public String[] getKeywords() {
        return this.keywords;
    }

    public Boolean getPaid() {
        return this.isPaid;
    }

    public String getStoreCategory() {
        return this.storeCategory;
    }

    public String[] getStoreSubCategories() {
        return this.storeSubCategories;
    }

    public String getStoreUrl() {
        return this.storeUrl;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getZip() {
        return this.zip;
    }

    @Override // up.l
    public /* bridge */ /* synthetic */ Object setExternalUserIds(List list) {
        return setExternalUserIds((List<ExternalUserId>) list);
    }

    @Override // up.l, up.g
    public TargetingParams addBlockedAdvertiserDomain(String str) {
        prepareBlockParams();
        this.blockedParams.addBlockedAdvertiserDomain(str);
        return this;
    }

    @Override // up.l, up.g
    public TargetingParams addBlockedAdvertiserIABCategory(String str) {
        prepareBlockParams();
        this.blockedParams.addBlockedAdvertiserIABCategory(str);
        return this;
    }

    @Override // up.l, up.g
    public TargetingParams addBlockedApplication(String str) {
        prepareBlockParams();
        this.blockedParams.addBlockedApplication(str);
        return this;
    }

    @Override // up.o
    public void merge(TargetingParams targetingParams) {
        this.userId = (String) nm.j.oneOf(this.userId, targetingParams.userId);
        this.gender = (pr.e) nm.j.oneOf(this.gender, targetingParams.gender);
        this.birthdayYear = (Integer) nm.j.oneOf(this.birthdayYear, targetingParams.birthdayYear);
        this.keywords = (String[]) nm.j.oneOf(this.keywords, targetingParams.keywords);
        this.country = (String) nm.j.oneOf(this.country, targetingParams.country);
        this.city = (String) nm.j.oneOf(this.city, targetingParams.city);
        this.zip = (String) nm.j.oneOf(this.zip, targetingParams.zip);
        this.deviceLocation = (Location) nm.j.oneOf(this.deviceLocation, targetingParams.deviceLocation);
        this.storeUrl = (String) nm.j.oneOf(this.storeUrl, targetingParams.storeUrl);
        this.storeCategory = (String) nm.j.oneOf(this.storeCategory, targetingParams.storeCategory);
        this.storeSubCategories = (String[]) nm.j.oneOf(this.storeSubCategories, targetingParams.storeSubCategories);
        this.framework = (String) nm.j.oneOf(this.framework, targetingParams.framework);
        this.isPaid = (Boolean) nm.j.oneOf(this.isPaid, targetingParams.isPaid);
        this.externalUserIdList = (List) nm.j.oneOf(this.externalUserIdList, targetingParams.externalUserIdList);
        if (targetingParams.blockedParams != null) {
            if (this.blockedParams == null) {
                this.blockedParams = new BlockedParams();
            }
            this.blockedParams.merge(targetingParams.blockedParams);
        }
    }

    @Override // up.l
    public TargetingParams setBirthdayYear(Integer num) {
        if (num == null || nm.j.isYearValid(num.intValue())) {
            this.birthdayYear = num;
            return this;
        }
        nm.a.e("Birthday Year should be 4-digit integer, more or equal 1900 and less or equal than current year");
        return this;
    }

    @Override // up.l
    public TargetingParams setCity(String str) {
        this.city = str;
        return this;
    }

    @Override // up.l
    public TargetingParams setCountry(String str) {
        this.country = str;
        return this;
    }

    @Override // up.l
    public TargetingParams setDeviceLocation(Location location) {
        this.deviceLocation = location;
        return this;
    }

    @Override // up.l
    public TargetingParams setExternalUserIds(List<ExternalUserId> list) {
        this.externalUserIdList = list;
        return this;
    }

    @Override // up.l
    public TargetingParams setFramework(String str) {
        this.framework = str;
        return this;
    }

    @Override // up.l
    public TargetingParams setGender(pr.e eVar) {
        this.gender = eVar;
        return this;
    }

    @Override // up.l
    public TargetingParams setKeywords(String... strArr) {
        this.keywords = strArr;
        return this;
    }

    @Override // up.l
    public TargetingParams setPaid(Boolean bool) {
        this.isPaid = bool;
        return this;
    }

    @Override // up.l
    public TargetingParams setStoreCategory(String str) {
        this.storeCategory = str;
        return this;
    }

    @Override // up.l
    public TargetingParams setStoreSubCategories(String... strArr) {
        this.storeSubCategories = strArr;
        return this;
    }

    @Override // up.l
    public TargetingParams setStoreUrl(String str) {
        this.storeUrl = str;
        return this;
    }

    @Override // up.l
    public TargetingParams setUserId(String str) {
        this.userId = str;
        return this;
    }

    @Override // up.l
    public TargetingParams setZip(String str) {
        this.zip = str;
        return this;
    }

    public void build(Context.User.Builder builder) {
        String str = this.userId;
        if (str != null) {
            builder.setId(str);
        }
        Integer num = this.birthdayYear;
        if (num != null) {
            builder.setYob(num.intValue());
        }
        pr.e eVar = this.gender;
        if (eVar != null) {
            builder.setGender(eVar.getOrtbValue());
        }
        String[] strArr = this.keywords;
        if (strArr != null && strArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : this.keywords) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            builder.setKeywords(sb2.toString());
        }
        Context.Geo.Builder builderNewBuilder = Context.Geo.newBuilder();
        build(builderNewBuilder);
        pr.i.fillGeoBuilder(builderNewBuilder, null, false);
        builder.setGeo(builderNewBuilder);
        List<ExternalUserId> list = this.externalUserIdList;
        if (list == null || list.size() <= 0) {
            return;
        }
        Context.Data.Builder id2 = Context.Data.newBuilder().setId(DATA_ID_EXTERNAL_USER_ID);
        for (ExternalUserId externalUserId : this.externalUserIdList) {
            String sourceId = externalUserId.getSourceId();
            String value = externalUserId.getValue();
            if (!TextUtils.isEmpty(sourceId) && !TextUtils.isEmpty(value)) {
                id2.addSegment(Context.Data.Segment.newBuilder().setId(sourceId).setValue(value));
            }
        }
        builder.addData(id2);
    }

    public void build(Context.Geo.Builder builder) {
        String str = this.country;
        if (str != null) {
            builder.setCountry(str);
        }
        String str2 = this.city;
        if (str2 != null) {
            builder.setCity(str2);
        }
        String str3 = this.zip;
        if (str3 != null) {
            builder.setZip(str3);
        }
    }
}
