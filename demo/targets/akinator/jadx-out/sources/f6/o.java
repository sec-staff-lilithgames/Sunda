package f6;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends s {
    public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        if (n3.q.hasAttribute(xmlPullParser, "pathData")) {
            TypedArray typedArrayObtainAttributes = n3.q.obtainAttributes(resources, theme, attributeSet, a.f55362d);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f55410b = string;
            }
            String string2 = typedArrayObtainAttributes.getString(1);
            if (string2 != null) {
                this.f55409a = o3.f.createNodesFromPathData(string2);
            }
            this.f55411c = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "fillType", 2, 0);
            typedArrayObtainAttributes.recycle();
        }
    }

    @Override // f6.s
    public boolean isClipPath() {
        return true;
    }
}
