package n1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static final List<g> toPathNodes(char c10, float[] args) {
        kotlin.jvm.internal.e0.checkNotNullParameter(args, "args");
        if (c10 == 'z' || c10 == 'Z') {
            return uu.o0.listOf(h.f75436c);
        }
        if (c10 == 'm') {
            qv.k kVarStep = qv.v.step(new qv.m(0, args.length - 2), 2);
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep, 10));
            Iterator it = kVarStep.iterator();
            while (it.hasNext()) {
                int iNextInt = ((uu.j1) it).nextInt();
                float[] fArrCopyOfRange = uu.f0.copyOfRange(args, iNextInt, iNextInt + 2);
                Object mVar = new g.m(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                if (iNextInt > 0) {
                    mVar = new g.l(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                }
                arrayList.add(mVar);
            }
            return arrayList;
        }
        if (c10 == 'M') {
            qv.k kVarStep2 = qv.v.step(new qv.m(0, args.length - 2), 2);
            ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep2, 10));
            Iterator it2 = kVarStep2.iterator();
            while (it2.hasNext()) {
                int iNextInt2 = ((uu.j1) it2).nextInt();
                float[] fArrCopyOfRange2 = uu.f0.copyOfRange(args, iNextInt2, iNextInt2 + 2);
                Object eVar = new g.e(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                if (iNextInt2 > 0) {
                    eVar = new g.d(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                }
                arrayList2.add(eVar);
            }
            return arrayList2;
        }
        if (c10 == 'l') {
            qv.k kVarStep3 = qv.v.step(new qv.m(0, args.length - 2), 2);
            ArrayList arrayList3 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep3, 10));
            Iterator it3 = kVarStep3.iterator();
            while (it3.hasNext()) {
                int iNextInt3 = ((uu.j1) it3).nextInt();
                float[] fArrCopyOfRange3 = uu.f0.copyOfRange(args, iNextInt3, iNextInt3 + 2);
                arrayList3.add(new g.l(fArrCopyOfRange3[0], fArrCopyOfRange3[1]));
            }
            return arrayList3;
        }
        if (c10 == 'L') {
            qv.k kVarStep4 = qv.v.step(new qv.m(0, args.length - 2), 2);
            ArrayList arrayList4 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep4, 10));
            Iterator it4 = kVarStep4.iterator();
            while (it4.hasNext()) {
                int iNextInt4 = ((uu.j1) it4).nextInt();
                float[] fArrCopyOfRange4 = uu.f0.copyOfRange(args, iNextInt4, iNextInt4 + 2);
                arrayList4.add(new g.d(fArrCopyOfRange4[0], fArrCopyOfRange4[1]));
            }
            return arrayList4;
        }
        if (c10 == 'h') {
            qv.k kVarStep5 = qv.v.step(new qv.m(0, args.length - 1), 1);
            ArrayList arrayList5 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep5, 10));
            Iterator it5 = kVarStep5.iterator();
            while (it5.hasNext()) {
                int iNextInt5 = ((uu.j1) it5).nextInt();
                arrayList5.add(new g.k(uu.f0.copyOfRange(args, iNextInt5, iNextInt5 + 1)[0]));
            }
            return arrayList5;
        }
        if (c10 == 'H') {
            qv.k kVarStep6 = qv.v.step(new qv.m(0, args.length - 1), 1);
            ArrayList arrayList6 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep6, 10));
            Iterator it6 = kVarStep6.iterator();
            while (it6.hasNext()) {
                int iNextInt6 = ((uu.j1) it6).nextInt();
                arrayList6.add(new g.c(uu.f0.copyOfRange(args, iNextInt6, iNextInt6 + 1)[0]));
            }
            return arrayList6;
        }
        if (c10 == 'v') {
            qv.k kVarStep7 = qv.v.step(new qv.m(0, args.length - 1), 1);
            ArrayList arrayList7 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep7, 10));
            Iterator it7 = kVarStep7.iterator();
            while (it7.hasNext()) {
                int iNextInt7 = ((uu.j1) it7).nextInt();
                arrayList7.add(new g.q(uu.f0.copyOfRange(args, iNextInt7, iNextInt7 + 1)[0]));
            }
            return arrayList7;
        }
        if (c10 == 'V') {
            qv.k kVarStep8 = qv.v.step(new qv.m(0, args.length - 1), 1);
            ArrayList arrayList8 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep8, 10));
            Iterator it8 = kVarStep8.iterator();
            while (it8.hasNext()) {
                int iNextInt8 = ((uu.j1) it8).nextInt();
                arrayList8.add(new g.r(uu.f0.copyOfRange(args, iNextInt8, iNextInt8 + 1)[0]));
            }
            return arrayList8;
        }
        if (c10 == 'c') {
            qv.k kVarStep9 = qv.v.step(new qv.m(0, args.length - 6), 6);
            ArrayList arrayList9 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep9, 10));
            Iterator it9 = kVarStep9.iterator();
            while (it9.hasNext()) {
                int iNextInt9 = ((uu.j1) it9).nextInt();
                float[] fArrCopyOfRange5 = uu.f0.copyOfRange(args, iNextInt9, iNextInt9 + 6);
                arrayList9.add(new g.j(fArrCopyOfRange5[0], fArrCopyOfRange5[1], fArrCopyOfRange5[2], fArrCopyOfRange5[3], fArrCopyOfRange5[4], fArrCopyOfRange5[5]));
            }
            return arrayList9;
        }
        if (c10 == 'C') {
            qv.k kVarStep10 = qv.v.step(new qv.m(0, args.length - 6), 6);
            ArrayList arrayList10 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep10, 10));
            Iterator it10 = kVarStep10.iterator();
            while (it10.hasNext()) {
                int iNextInt10 = ((uu.j1) it10).nextInt();
                float[] fArrCopyOfRange6 = uu.f0.copyOfRange(args, iNextInt10, iNextInt10 + 6);
                arrayList10.add(new g.b(fArrCopyOfRange6[0], fArrCopyOfRange6[1], fArrCopyOfRange6[2], fArrCopyOfRange6[3], fArrCopyOfRange6[4], fArrCopyOfRange6[5]));
            }
            return arrayList10;
        }
        if (c10 == 's') {
            qv.k kVarStep11 = qv.v.step(new qv.m(0, args.length - 4), 4);
            ArrayList arrayList11 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep11, 10));
            Iterator it11 = kVarStep11.iterator();
            while (it11.hasNext()) {
                int iNextInt11 = ((uu.j1) it11).nextInt();
                float[] fArrCopyOfRange7 = uu.f0.copyOfRange(args, iNextInt11, iNextInt11 + 4);
                arrayList11.add(new g.o(fArrCopyOfRange7[0], fArrCopyOfRange7[1], fArrCopyOfRange7[2], fArrCopyOfRange7[3]));
            }
            return arrayList11;
        }
        if (c10 == 'S') {
            qv.k kVarStep12 = qv.v.step(new qv.m(0, args.length - 4), 4);
            ArrayList arrayList12 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep12, 10));
            Iterator it12 = kVarStep12.iterator();
            while (it12.hasNext()) {
                int iNextInt12 = ((uu.j1) it12).nextInt();
                float[] fArrCopyOfRange8 = uu.f0.copyOfRange(args, iNextInt12, iNextInt12 + 4);
                arrayList12.add(new g.C0751g(fArrCopyOfRange8[0], fArrCopyOfRange8[1], fArrCopyOfRange8[2], fArrCopyOfRange8[3]));
            }
            return arrayList12;
        }
        if (c10 == 'q') {
            qv.k kVarStep13 = qv.v.step(new qv.m(0, args.length - 4), 4);
            ArrayList arrayList13 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep13, 10));
            Iterator it13 = kVarStep13.iterator();
            while (it13.hasNext()) {
                int iNextInt13 = ((uu.j1) it13).nextInt();
                float[] fArrCopyOfRange9 = uu.f0.copyOfRange(args, iNextInt13, iNextInt13 + 4);
                arrayList13.add(new g.n(fArrCopyOfRange9[0], fArrCopyOfRange9[1], fArrCopyOfRange9[2], fArrCopyOfRange9[3]));
            }
            return arrayList13;
        }
        if (c10 == 'Q') {
            qv.k kVarStep14 = qv.v.step(new qv.m(0, args.length - 4), 4);
            ArrayList arrayList14 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep14, 10));
            Iterator it14 = kVarStep14.iterator();
            while (it14.hasNext()) {
                int iNextInt14 = ((uu.j1) it14).nextInt();
                float[] fArrCopyOfRange10 = uu.f0.copyOfRange(args, iNextInt14, iNextInt14 + 4);
                arrayList14.add(new g.f(fArrCopyOfRange10[0], fArrCopyOfRange10[1], fArrCopyOfRange10[2], fArrCopyOfRange10[3]));
            }
            return arrayList14;
        }
        if (c10 == 't') {
            qv.k kVarStep15 = qv.v.step(new qv.m(0, args.length - 2), 2);
            ArrayList arrayList15 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep15, 10));
            Iterator it15 = kVarStep15.iterator();
            while (it15.hasNext()) {
                int iNextInt15 = ((uu.j1) it15).nextInt();
                float[] fArrCopyOfRange11 = uu.f0.copyOfRange(args, iNextInt15, iNextInt15 + 2);
                arrayList15.add(new g.p(fArrCopyOfRange11[0], fArrCopyOfRange11[1]));
            }
            return arrayList15;
        }
        if (c10 == 'T') {
            qv.k kVarStep16 = qv.v.step(new qv.m(0, args.length - 2), 2);
            ArrayList arrayList16 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep16, 10));
            Iterator it16 = kVarStep16.iterator();
            while (it16.hasNext()) {
                int iNextInt16 = ((uu.j1) it16).nextInt();
                float[] fArrCopyOfRange12 = uu.f0.copyOfRange(args, iNextInt16, iNextInt16 + 2);
                arrayList16.add(new g.h(fArrCopyOfRange12[0], fArrCopyOfRange12[1]));
            }
            return arrayList16;
        }
        if (c10 == 'a') {
            qv.k kVarStep17 = qv.v.step(new qv.m(0, args.length - 7), 7);
            ArrayList arrayList17 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep17, 10));
            Iterator it17 = kVarStep17.iterator();
            while (it17.hasNext()) {
                int iNextInt17 = ((uu.j1) it17).nextInt();
                float[] fArrCopyOfRange13 = uu.f0.copyOfRange(args, iNextInt17, iNextInt17 + 7);
                arrayList17.add(new g.i(fArrCopyOfRange13[0], fArrCopyOfRange13[1], fArrCopyOfRange13[2], Float.compare(fArrCopyOfRange13[3], 0.0f) != 0, Float.compare(fArrCopyOfRange13[4], 0.0f) != 0, fArrCopyOfRange13[5], fArrCopyOfRange13[6]));
            }
            return arrayList17;
        }
        if (c10 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c10);
        }
        qv.k kVarStep18 = qv.v.step(new qv.m(0, args.length - 7), 7);
        ArrayList arrayList18 = new ArrayList(uu.q0.collectionSizeOrDefault(kVarStep18, 10));
        Iterator it18 = kVarStep18.iterator();
        while (it18.hasNext()) {
            int iNextInt18 = ((uu.j1) it18).nextInt();
            float[] fArrCopyOfRange14 = uu.f0.copyOfRange(args, iNextInt18, iNextInt18 + 7);
            arrayList18.add(new g.a(fArrCopyOfRange14[0], fArrCopyOfRange14[1], fArrCopyOfRange14[2], Float.compare(fArrCopyOfRange14[3], 0.0f) != 0, Float.compare(fArrCopyOfRange14[4], 0.0f) != 0, fArrCopyOfRange14[5], fArrCopyOfRange14[6]));
        }
        return arrayList18;
    }
}
