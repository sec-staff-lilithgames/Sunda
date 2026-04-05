package as;

import com.amazon.device.ads.DtbConstants;
import com.ironsource.C3271ic;
import com.ironsource.Ib;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final pw.l f7967a = pw.l.encodeUtf8(":");

    /* renamed from: b, reason: collision with root package name */
    public static final e[] f7968b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f7969c;

    static {
        e eVar = new e(e.f7945h, "");
        pw.l lVar = e.f7942e;
        e eVar2 = new e(lVar, C3271ic.f36943a);
        e eVar3 = new e(lVar, C3271ic.f36944b);
        pw.l lVar2 = e.f7943f;
        e eVar4 = new e(lVar2, "/");
        e eVar5 = new e(lVar2, "/index.html");
        pw.l lVar3 = e.f7944g;
        e eVar6 = new e(lVar3, "http");
        e eVar7 = new e(lVar3, HttpRequest.DEFAULT_SCHEME);
        pw.l lVar4 = e.f7941d;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, new e(lVar4, "200"), new e(lVar4, "204"), new e(lVar4, "206"), new e(lVar4, "304"), new e(lVar4, "400"), new e(lVar4, "404"), new e(lVar4, "500"), new e("accept-charset", ""), new e("accept-encoding", "gzip, deflate"), new e("accept-language", ""), new e("accept-ranges", ""), new e("accept", ""), new e("access-control-allow-origin", ""), new e("age", ""), new e("allow", ""), new e("authorization", ""), new e("cache-control", ""), new e("content-disposition", ""), new e("content-encoding", ""), new e("content-language", ""), new e("content-length", ""), new e("content-location", ""), new e("content-range", ""), new e("content-type", ""), new e("cookie", ""), new e("date", ""), new e(DownloadModel.ETAG, ""), new e("expect", ""), new e("expires", ""), new e("from", ""), new e("host", ""), new e("if-match", ""), new e("if-modified-since", ""), new e("if-none-match", ""), new e("if-range", ""), new e("if-unmodified-since", ""), new e("last-modified", ""), new e("link", ""), new e(DtbConstants.PRIVACY_LOCATION_KEY, ""), new e("max-forwards", ""), new e("proxy-authenticate", ""), new e("proxy-authorization", ""), new e("range", ""), new e("referer", ""), new e(ToolBar.REFRESH, ""), new e("retry-after", ""), new e(Ib.f34672a, ""), new e("set-cookie", ""), new e("strict-transport-security", ""), new e("transfer-encoding", ""), new e("user-agent", ""), new e("vary", ""), new e("via", ""), new e("www-authenticate", "")};
        f7968b = eVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(eVarArr.length);
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (!linkedHashMap.containsKey(eVarArr[i10].f7946a)) {
                linkedHashMap.put(eVarArr[i10].f7946a, Integer.valueOf(i10));
            }
        }
        f7969c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(pw.l lVar) throws IOException {
        int size = lVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte b10 = lVar.getByte(i10);
            if (b10 >= 65 && b10 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + lVar.utf8());
            }
        }
    }
}
