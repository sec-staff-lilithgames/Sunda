package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f5570a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5571b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f5572c;

    public u(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        this.f5572c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.f5561t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f5570a = typedArrayObtainStyledAttributes.getResourceId(index, this.f5570a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5572c);
                this.f5572c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                TtmlNode.TAG_LAYOUT.equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public int findMatch(float f10, float f11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5571b;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((v) arrayList.get(i10)).a(f10, f11)) {
                return i10;
            }
            i10++;
        }
    }
}
