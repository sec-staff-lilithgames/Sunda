package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f5407a;

    /* renamed from: b, reason: collision with root package name */
    public int f5408b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f5409c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f5410d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f5411e = new SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public o f5412f = null;

    public i(Context context, ConstraintLayout constraintLayout, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        g gVar = null;
        this.f5407a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                gVar = new g(context, xml);
                                this.f5410d.put(gVar.f5397a, gVar);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                h hVar = new h(context, xml);
                                if (gVar != null) {
                                    gVar.f5398b.add(hVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e11);
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, NumberFormatException, IOException {
        k kVar = new k();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                kVar.load(context, xmlResourceParser);
                this.f5411e.put(identifier, kVar);
                return;
            }
        }
    }

    public boolean needsToChange(int i10, float f10, float f11) {
        int i11 = this.f5408b;
        if (i11 != i10) {
            return true;
        }
        SparseArray sparseArray = this.f5410d;
        g gVar = (g) (i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11));
        int i12 = this.f5409c;
        return (i12 == -1 || !((h) gVar.f5398b.get(i12)).a(f10, f11)) && this.f5409c != gVar.findMatch(f10, f11);
    }

    public void setOnConstraintsChanged(o oVar) {
        this.f5412f = oVar;
    }

    public void updateConstraints(int i10, float f10, float f11) {
        int i11 = this.f5408b;
        ConstraintLayout constraintLayout = this.f5407a;
        SparseArray sparseArray = this.f5410d;
        if (i11 == i10) {
            g gVar = i10 == -1 ? (g) sparseArray.valueAt(0) : (g) sparseArray.get(i11);
            int i12 = this.f5409c;
            if (i12 == -1 || !((h) gVar.f5398b.get(i12)).a(f10, f11)) {
                int iFindMatch = gVar.findMatch(f10, f11);
                ArrayList arrayList = gVar.f5398b;
                if (this.f5409c == iFindMatch) {
                    return;
                }
                k kVar = iFindMatch == -1 ? null : ((h) arrayList.get(iFindMatch)).f5406f;
                int i13 = iFindMatch == -1 ? gVar.f5399c : ((h) arrayList.get(iFindMatch)).f5405e;
                if (kVar == null) {
                    return;
                }
                this.f5409c = iFindMatch;
                o oVar = this.f5412f;
                if (oVar != null) {
                    oVar.preLayoutChange(-1, i13);
                }
                kVar.applyTo(constraintLayout);
                o oVar2 = this.f5412f;
                if (oVar2 != null) {
                    oVar2.postLayoutChange(-1, i13);
                    return;
                }
                return;
            }
            return;
        }
        this.f5408b = i10;
        g gVar2 = (g) sparseArray.get(i10);
        int iFindMatch2 = gVar2.findMatch(f10, f11);
        ArrayList arrayList2 = gVar2.f5398b;
        k kVar2 = iFindMatch2 == -1 ? gVar2.f5400d : ((h) arrayList2.get(iFindMatch2)).f5406f;
        int i14 = iFindMatch2 == -1 ? gVar2.f5399c : ((h) arrayList2.get(iFindMatch2)).f5405e;
        if (kVar2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
            return;
        }
        this.f5409c = iFindMatch2;
        o oVar3 = this.f5412f;
        if (oVar3 != null) {
            oVar3.preLayoutChange(i10, i14);
        }
        kVar2.applyTo(constraintLayout);
        o oVar4 = this.f5412f;
        if (oVar4 != null) {
            oVar4.postLayoutChange(i10, i14);
        }
    }
}
