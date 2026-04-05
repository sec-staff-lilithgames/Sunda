package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f5401a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5402b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5403c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5405e;

    /* renamed from: f, reason: collision with root package name */
    public final k f5406f;

    public h(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f5401a = Float.NaN;
        this.f5402b = Float.NaN;
        this.f5403c = Float.NaN;
        this.f5404d = Float.NaN;
        this.f5405e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f5565x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5405e);
                this.f5405e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                    k kVar = new k();
                    this.f5406f = kVar;
                    kVar.clone(context, resourceId);
                }
            } else if (index == 1) {
                this.f5404d = typedArrayObtainStyledAttributes.getDimension(index, this.f5404d);
            } else if (index == 2) {
                this.f5402b = typedArrayObtainStyledAttributes.getDimension(index, this.f5402b);
            } else if (index == 3) {
                this.f5403c = typedArrayObtainStyledAttributes.getDimension(index, this.f5403c);
            } else if (index == 4) {
                this.f5401a = typedArrayObtainStyledAttributes.getDimension(index, this.f5401a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f10, float f11) {
        float f12 = this.f5401a;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f5402b;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f5403c;
        if (!Float.isNaN(f14) && f10 > f14) {
            return false;
        }
        float f15 = this.f5404d;
        return Float.isNaN(f15) || f11 <= f15;
    }
}
