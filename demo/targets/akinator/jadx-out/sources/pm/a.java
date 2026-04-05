package pm;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeAssetPosition;
import io.bidmachine.LabelData;
import io.bidmachine.PositionData;
import ir.s;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f81487a;

    public a(c positionDataMapper) {
        e0.checkNotNullParameter(positionDataMapper, "positionDataMapper");
        this.f81487a = positionDataMapper;
    }

    public final LabelData map(Ad.Display.Native.Asset.LabelAsset data) {
        e0.checkNotNullParameter(data, "data");
        try {
            c cVar = this.f81487a;
            NativeAssetPosition pos = data.getPos();
            e0.checkNotNullExpressionValue(pos, "data.pos");
            PositionData map = cVar.map(pos);
            if (map == null) {
                return null;
            }
            String content = data.getContent();
            e0.checkNotNullExpressionValue(content, "data.content");
            byte[] bytes = content.getBytes(g.f86134b);
            e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDecodeBase64$default = s.decodeBase64$default(bytes, 0, 1, (Object) null);
            if (bArrDecodeBase64$default == null) {
                return null;
            }
            Bitmap image = BitmapFactory.decodeByteArray(bArrDecodeBase64$default, 0, bArrDecodeBase64$default.length);
            float w10 = data.getW();
            float h10 = data.getH();
            e0.checkNotNullExpressionValue(image, "image");
            return new LabelData(w10, h10, image, map);
        } catch (Throwable unused) {
            return null;
        }
    }
}
