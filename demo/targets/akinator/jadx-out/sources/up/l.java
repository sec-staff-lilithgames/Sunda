package up;

import android.location.Location;
import io.bidmachine.ExternalUserId;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface l extends g {
    @Override // up.g
    /* synthetic */ Object addBlockedAdvertiserDomain(String str);

    @Override // up.g
    /* synthetic */ Object addBlockedAdvertiserIABCategory(String str);

    @Override // up.g
    /* synthetic */ Object addBlockedApplication(String str);

    Object setBirthdayYear(Integer num);

    Object setCity(String str);

    Object setCountry(String str);

    Object setDeviceLocation(Location location);

    Object setExternalUserIds(List<ExternalUserId> list);

    Object setFramework(String str);

    Object setGender(pr.e eVar);

    Object setKeywords(String... strArr);

    Object setPaid(Boolean bool);

    Object setStoreCategory(String str);

    Object setStoreSubCategories(String... strArr);

    Object setStoreUrl(String str);

    Object setUserId(String str);

    Object setZip(String str);
}
