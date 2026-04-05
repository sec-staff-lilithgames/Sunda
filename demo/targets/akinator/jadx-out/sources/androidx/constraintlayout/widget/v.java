package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final float f5573a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5574b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5575c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5577e;

    public v(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        this.f5573a = Float.NaN;
        this.f5574b = Float.NaN;
        this.f5575c = Float.NaN;
        this.f5576d = Float.NaN;
        this.f5577e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.f5565x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5577e);
                this.f5577e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                TtmlNode.TAG_LAYOUT.equals(resourceTypeName);
            } else if (index == 1) {
                this.f5576d = typedArrayObtainStyledAttributes.getDimension(index, this.f5576d);
            } else if (index == 2) {
                this.f5574b = typedArrayObtainStyledAttributes.getDimension(index, this.f5574b);
            } else if (index == 3) {
                this.f5575c = typedArrayObtainStyledAttributes.getDimension(index, this.f5575c);
            } else if (index == 4) {
                this.f5573a = typedArrayObtainStyledAttributes.getDimension(index, this.f5573a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f10, float f11) {
        float f12 = this.f5573a;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f5574b;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f5575c;
        if (!Float.isNaN(f14) && f10 > f14) {
            return false;
        }
        float f15 = this.f5576d;
        return Float.isNaN(f15) || f11 <= f15;
    }
}
