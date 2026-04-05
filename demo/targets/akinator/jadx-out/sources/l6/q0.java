package l6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k6.x;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f72476a;

    public q0(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f72476a = webSettingsBoundaryInterface;
    }

    public int getAttributionRegistrationBehavior() {
        return this.f72476a.getAttributionBehavior();
    }

    public boolean getBackForwardCacheEnabled() {
        return this.f72476a.getBackForwardCacheEnabled();
    }

    public int getDisabledActionModeMenuItems() {
        return this.f72476a.getDisabledActionModeMenuItems();
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.f72476a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int getForceDark() {
        return this.f72476a.getForceDark();
    }

    public int getForceDarkStrategy() {
        return this.f72476a.getForceDarkBehavior();
    }

    public boolean getOffscreenPreRaster() {
        return this.f72476a.getOffscreenPreRaster();
    }

    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return this.f72476a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean getSafeBrowsingEnabled() {
        return this.f72476a.getSafeBrowsingEnabled();
    }

    public int getSpeculativeLoadingStatus() {
        return this.f72476a.getSpeculativeLoadingStatus();
    }

    public k6.k getUserAgentMetadata() {
        Map<String, Object> userAgentMetadataMap = this.f72476a.getUserAgentMetadataMap();
        k6.j jVar = new k6.j();
        Object obj = userAgentMetadataMap.get("BRAND_VERSION_LIST");
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : (String[][]) obj) {
                arrayList.add(new k6.h().setBrand(strArr[0]).setMajorVersion(strArr[1]).setFullVersion(strArr[2]).build());
            }
            jVar.setBrandVersionList(arrayList);
        }
        String str = (String) userAgentMetadataMap.get("FULL_VERSION");
        if (str != null) {
            jVar.setFullVersion(str);
        }
        String str2 = (String) userAgentMetadataMap.get("PLATFORM");
        if (str2 != null) {
            jVar.setPlatform(str2);
        }
        String str3 = (String) userAgentMetadataMap.get("PLATFORM_VERSION");
        if (str3 != null) {
            jVar.setPlatformVersion(str3);
        }
        String str4 = (String) userAgentMetadataMap.get("ARCHITECTURE");
        if (str4 != null) {
            jVar.setArchitecture(str4);
        }
        String str5 = (String) userAgentMetadataMap.get("MODEL");
        if (str5 != null) {
            jVar.setModel(str5);
        }
        Boolean bool = (Boolean) userAgentMetadataMap.get("MOBILE");
        if (bool != null) {
            jVar.setMobile(bool.booleanValue());
        }
        Integer num = (Integer) userAgentMetadataMap.get("BITNESS");
        if (num != null) {
            jVar.setBitness(num.intValue());
        }
        Boolean bool2 = (Boolean) userAgentMetadataMap.get("WOW64");
        if (bool2 != null) {
            jVar.setWow64(bool2.booleanValue());
        }
        return jVar.build();
    }

    public int getWebAuthenticationSupport() {
        return this.f72476a.getWebauthnSupport();
    }

    public k6.x getWebViewMediaIntegrityApiStatus() {
        WebSettingsBoundaryInterface webSettingsBoundaryInterface = this.f72476a;
        return new x.a(webSettingsBoundaryInterface.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(webSettingsBoundaryInterface.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.f72476a.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z10) {
        this.f72476a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void setAttributionRegistrationBehavior(int i10) {
        this.f72476a.setAttributionBehavior(i10);
    }

    public void setBackForwardCacheEnabled(boolean z10) {
        this.f72476a.setBackForwardCacheEnabled(z10);
    }

    public void setDisabledActionModeMenuItems(int i10) {
        this.f72476a.setDisabledActionModeMenuItems(i10);
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z10) {
        this.f72476a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    public void setForceDark(int i10) {
        this.f72476a.setForceDark(i10);
    }

    public void setForceDarkStrategy(int i10) {
        this.f72476a.setForceDarkBehavior(i10);
    }

    public void setOffscreenPreRaster(boolean z10) {
        this.f72476a.setOffscreenPreRaster(z10);
    }

    public void setRequestedWithHeaderOriginAllowList(Set<String> set) {
        this.f72476a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void setSafeBrowsingEnabled(boolean z10) {
        this.f72476a.setSafeBrowsingEnabled(z10);
    }

    public void setSpeculativeLoadingStatus(int i10) {
        this.f72476a.setSpeculativeLoadingStatus(i10);
    }

    public void setUserAgentMetadata(k6.k kVar) {
        String[][] strArr;
        HashMap map = new HashMap();
        List<k6.i> brandVersionList = kVar.getBrandVersionList();
        if (brandVersionList == null || brandVersionList.isEmpty()) {
            strArr = null;
        } else {
            strArr = (String[][]) Array.newInstance((Class<?>) String.class, brandVersionList.size(), 3);
            for (int i10 = 0; i10 < brandVersionList.size(); i10++) {
                strArr[i10][0] = brandVersionList.get(i10).getBrand();
                strArr[i10][1] = brandVersionList.get(i10).getMajorVersion();
                strArr[i10][2] = brandVersionList.get(i10).getFullVersion();
            }
        }
        map.put("BRAND_VERSION_LIST", strArr);
        map.put("FULL_VERSION", kVar.getFullVersion());
        map.put("PLATFORM", kVar.getPlatform());
        map.put("PLATFORM_VERSION", kVar.getPlatformVersion());
        map.put("ARCHITECTURE", kVar.getArchitecture());
        map.put("MODEL", kVar.getModel());
        map.put("MOBILE", Boolean.valueOf(kVar.isMobile()));
        map.put("BITNESS", Integer.valueOf(kVar.getBitness()));
        map.put("WOW64", Boolean.valueOf(kVar.isWow64()));
        this.f72476a.setUserAgentMetadataFromMap(map);
    }

    public void setWebAuthenticationSupport(int i10) {
        this.f72476a.setWebauthnSupport(i10);
    }

    public void setWebViewMediaIntegrityApiStatus(k6.x xVar) {
        this.f72476a.setWebViewMediaIntegrityApiStatus(xVar.getDefaultStatus(), xVar.getOverrideRules());
    }
}
