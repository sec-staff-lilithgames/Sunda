package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f5578a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f5579b = new SparseArray();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public w(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f5578a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.f5562u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f5578a = typedArrayObtainStyledAttributes.getResourceId(index, this.f5578a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            u uVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                uVar = new u(context, xmlPullParser);
                                this.f5579b.put(uVar.f5570a, uVar);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                v vVar = new v(context, xmlPullParser);
                                if (uVar != null) {
                                    uVar.f5571b.add(vVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        }
    }

    public int convertToConstraintSet(int i10, int i11, float f10, float f11) {
        u uVar = (u) this.f5579b.get(i11);
        if (uVar == null) {
            return i11;
        }
        ArrayList arrayList = uVar.f5571b;
        int i12 = uVar.f5572c;
        if (f10 != -1.0f && f11 != -1.0f) {
            Iterator it = arrayList.iterator();
            v vVar = null;
            while (it.hasNext()) {
                v vVar2 = (v) it.next();
                if (vVar2.a(f10, f11)) {
                    if (i10 != vVar2.f5577e) {
                        vVar = vVar2;
                    }
                }
            }
            return vVar != null ? vVar.f5577e : i12;
        }
        if (i12 != i10) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (i10 == ((v) it2.next()).f5577e) {
                }
            }
            return i12;
        }
        return i10;
    }

    public boolean needsToChange(int i10, float f10, float f11) {
        if (-1 != i10) {
            return true;
        }
        SparseArray sparseArray = this.f5579b;
        return -1 != ((u) (i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1))).findMatch(f10, f11);
    }

    public int stateGetConstraintID(int i10, int i11, int i12) {
        return updateConstraints(-1, i10, i11, i12);
    }

    public int updateConstraints(int i10, int i11, float f10, float f11) {
        SparseArray sparseArray = this.f5579b;
        if (i10 == i11) {
            u uVar = i11 == -1 ? (u) sparseArray.valueAt(0) : (u) sparseArray.get(-1);
            if (uVar != null) {
                ArrayList arrayList = uVar.f5571b;
                int iFindMatch = uVar.findMatch(f10, f11);
                return i10 == iFindMatch ? i10 : iFindMatch == -1 ? uVar.f5572c : ((v) arrayList.get(iFindMatch)).f5577e;
            }
        } else {
            u uVar2 = (u) sparseArray.get(i11);
            if (uVar2 != null) {
                int iFindMatch2 = uVar2.findMatch(f10, f11);
                return iFindMatch2 == -1 ? uVar2.f5572c : ((v) uVar2.f5571b.get(iFindMatch2)).f5577e;
            }
        }
        return -1;
    }

    public void setOnConstraintsChanged(o oVar) {
    }
}
