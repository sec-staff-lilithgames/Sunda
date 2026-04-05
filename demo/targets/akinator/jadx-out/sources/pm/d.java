package pm;

import br.p1;
import com.explorestack.protobuf.adcom.Ad;
import cr.o;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f81488a;

    public d(a labelDataMapper) {
        e0.checkNotNullParameter(labelDataMapper, "labelDataMapper");
        this.f81488a = labelDataMapper;
    }

    public final PrivacySheetData map(Ad.Display.Native.Asset data) {
        e0.checkNotNullParameter(data, "data");
        try {
            String value = data.getData().getValue();
            e0.checkNotNullExpressionValue(value, "data.data.value");
            p1 json = o.parseJson(value);
            if (json == null) {
                return null;
            }
            a aVar = this.f81488a;
            Ad.Display.Native.Asset.LabelAsset label = data.getLabel();
            e0.checkNotNullExpressionValue(label, "data.label");
            LabelData map = aVar.map(label);
            if (map == null) {
                return null;
            }
            return new PrivacySheetData(map, json);
        } catch (Throwable unused) {
            return null;
        }
    }
}
