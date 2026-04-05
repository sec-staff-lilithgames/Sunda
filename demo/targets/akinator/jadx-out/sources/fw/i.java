package fw;

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
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f56163a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final f[] f56164b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f56165c;

    static {
        f fVar = new f(f.f56142i, "");
        pw.l lVar = f.f56139f;
        f fVar2 = new f(lVar, C3271ic.f36943a);
        f fVar3 = new f(lVar, C3271ic.f36944b);
        pw.l lVar2 = f.f56140g;
        f fVar4 = new f(lVar2, "/");
        f fVar5 = new f(lVar2, "/index.html");
        pw.l lVar3 = f.f56141h;
        f fVar6 = new f(lVar3, "http");
        f fVar7 = new f(lVar3, HttpRequest.DEFAULT_SCHEME);
        pw.l lVar4 = f.f56138e;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, new f(lVar4, "200"), new f(lVar4, "204"), new f(lVar4, "206"), new f(lVar4, "304"), new f(lVar4, "400"), new f(lVar4, "404"), new f(lVar4, "500"), new f("accept-charset", ""), new f("accept-encoding", "gzip, deflate"), new f("accept-language", ""), new f("accept-ranges", ""), new f("accept", ""), new f("access-control-allow-origin", ""), new f("age", ""), new f("allow", ""), new f("authorization", ""), new f("cache-control", ""), new f("content-disposition", ""), new f("content-encoding", ""), new f("content-language", ""), new f("content-length", ""), new f("content-location", ""), new f("content-range", ""), new f("content-type", ""), new f("cookie", ""), new f("date", ""), new f(DownloadModel.ETAG, ""), new f("expect", ""), new f("expires", ""), new f("from", ""), new f("host", ""), new f("if-match", ""), new f("if-modified-since", ""), new f("if-none-match", ""), new f("if-range", ""), new f("if-unmodified-since", ""), new f("last-modified", ""), new f("link", ""), new f(DtbConstants.PRIVACY_LOCATION_KEY, ""), new f("max-forwards", ""), new f("proxy-authenticate", ""), new f("proxy-authorization", ""), new f("range", ""), new f("referer", ""), new f(ToolBar.REFRESH, ""), new f("retry-after", ""), new f(Ib.f34672a, ""), new f("set-cookie", ""), new f("strict-transport-security", ""), new f("transfer-encoding", ""), new f("user-agent", ""), new f("vary", ""), new f("via", ""), new f("www-authenticate", "")};
        f56164b = fVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fVarArr.length, 1.0f);
        int length = fVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!linkedHashMap.containsKey(fVarArr[i10].f56143a)) {
                linkedHashMap.put(fVarArr[i10].f56143a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        f56165c = mapUnmodifiableMap;
    }

    public final pw.l checkLowercase(pw.l name) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte b10 = name.getByte(i10);
            if (65 <= b10 && b10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    public final Map<pw.l, Integer> getNAME_TO_FIRST_INDEX() {
        return f56165c;
    }

    public final f[] getSTATIC_HEADER_TABLE() {
        return f56164b;
    }
}
