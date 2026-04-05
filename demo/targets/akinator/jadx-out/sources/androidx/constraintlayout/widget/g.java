package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f5397a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5398b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f5399c;

    /* renamed from: d, reason: collision with root package name */
    public final k f5400d;

    public g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f5399c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f5561t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f5397a = typedArrayObtainStyledAttributes.getResourceId(index, this.f5397a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5399c);
                this.f5399c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                    k kVar = new k();
                    this.f5400d = kVar;
                    kVar.clone(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public int findMatch(float f10, float f11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5398b;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((h) arrayList.get(i10)).a(f10, f11)) {
                return i10;
            }
            i10++;
        }
    }
}
