package g2;

import java.util.ArrayList;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    public final String f56709b;

    /* renamed from: c, reason: collision with root package name */
    public final List f56710c;

    /* renamed from: e, reason: collision with root package name */
    public final List f56711e;

    /* renamed from: f, reason: collision with root package name */
    public final List f56712f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final StringBuilder f56713a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f56714b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f56715c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f56716d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f56717e;

        public a() {
            this(0, 1, null);
        }

        public final void addStringAnnotation(String tag, String annotation, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter(annotation, "annotation");
            this.f56716d.add(new C0569a(annotation, i10, i11, tag));
        }

        public final void addStyle(r1 style, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
            this.f56714b.add(new C0569a(style, i10, i11, null, 8, null));
        }

        public final void addTtsAnnotation(f2 ttsAnnotation, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            this.f56716d.add(new C0569a(ttsAnnotation, i10, i11, null, 8, null));
        }

        public final void append(String text) {
            kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
            this.f56713a.append(text);
        }

        public final int getLength() {
            return this.f56713a.length();
        }

        public final void pop() {
            ArrayList arrayList = this.f56717e;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            ((C0569a) arrayList.remove(arrayList.size() - 1)).setEnd(this.f56713a.length());
        }

        public final int pushStringAnnotation(String tag, String annotation) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter(annotation, "annotation");
            C0569a c0569a = new C0569a(annotation, this.f56713a.length(), 0, tag, 4, null);
            this.f56717e.add(c0569a);
            this.f56716d.add(c0569a);
            return r9.size() - 1;
        }

        public final int pushStyle(r1 style) {
            kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
            C0569a c0569a = new C0569a(style, this.f56713a.length(), 0, null, 12, null);
            this.f56717e.add(c0569a);
            this.f56714b.add(c0569a);
            return r9.size() - 1;
        }

        public final int pushTtsAnnotation(f2 ttsAnnotation) {
            kotlin.jvm.internal.e0.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            C0569a c0569a = new C0569a(ttsAnnotation, this.f56713a.length(), 0, null, 12, null);
            this.f56717e.add(c0569a);
            this.f56716d.add(c0569a);
            return r9.size() - 1;
        }

        public final b toAnnotatedString() {
            StringBuilder sb2 = this.f56713a;
            String string = sb2.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "text.toString()");
            ArrayList arrayList = this.f56714b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(((C0569a) arrayList.get(i10)).toRange(sb2.length()));
            }
            ArrayList arrayList3 = this.f56715c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList4.add(((C0569a) arrayList3.get(i11)).toRange(sb2.length()));
            }
            ArrayList arrayList5 = this.f56716d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList6.add(((C0569a) arrayList5.get(i12)).toRange(sb2.length()));
            }
            return new b(string, arrayList2, arrayList4, arrayList6);
        }

        public a(int i10) {
            this.f56713a = new StringBuilder(i10);
            this.f56714b = new ArrayList();
            this.f56715c = new ArrayList();
            this.f56716d = new ArrayList();
            this.f56717e = new ArrayList();
        }

        public final void addStyle(x style, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
            this.f56715c.add(new C0569a(style, i10, i11, null, 8, null));
        }

        public final void append(char c10) {
            this.f56713a.append(c10);
        }

        public final void append(b text) {
            kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
            StringBuilder sb2 = this.f56713a;
            int length = sb2.length();
            sb2.append(text.getText());
            List<C0570b> spanStyles = text.getSpanStyles();
            int size = spanStyles.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0570b c0570b = spanStyles.get(i10);
                addStyle((r1) c0570b.getItem(), c0570b.getStart() + length, c0570b.getEnd() + length);
            }
            List<C0570b> paragraphStyles = text.getParagraphStyles();
            int size2 = paragraphStyles.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C0570b c0570b2 = paragraphStyles.get(i11);
                addStyle((x) c0570b2.getItem(), c0570b2.getStart() + length, c0570b2.getEnd() + length);
            }
            List<C0570b> annotations$ui_text_release = text.getAnnotations$ui_text_release();
            int size3 = annotations$ui_text_release.size();
            for (int i12 = 0; i12 < size3; i12++) {
                C0570b c0570b3 = annotations$ui_text_release.get(i12);
                this.f56716d.add(new C0569a(c0570b3.getItem(), c0570b3.getStart() + length, c0570b3.getEnd() + length, c0570b3.getTag()));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: g2.b$a$a, reason: collision with other inner class name */
        public static final class C0569a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f56718a;

            /* renamed from: b, reason: collision with root package name */
            public final int f56719b;

            /* renamed from: c, reason: collision with root package name */
            public int f56720c;

            /* renamed from: d, reason: collision with root package name */
            public final String f56721d;

            public C0569a(Object obj, int i10, int i11, String tag) {
                kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
                this.f56718a = obj;
                this.f56719b = i10;
                this.f56720c = i11;
                this.f56721d = tag;
            }

            public static /* synthetic */ C0569a copy$default(C0569a c0569a, Object obj, int i10, int i11, String str, int i12, Object obj2) {
                if ((i12 & 1) != 0) {
                    obj = c0569a.f56718a;
                }
                if ((i12 & 2) != 0) {
                    i10 = c0569a.f56719b;
                }
                if ((i12 & 4) != 0) {
                    i11 = c0569a.f56720c;
                }
                if ((i12 & 8) != 0) {
                    str = c0569a.f56721d;
                }
                return c0569a.copy(obj, i10, i11, str);
            }

            public static /* synthetic */ C0570b toRange$default(C0569a c0569a, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return c0569a.toRange(i10);
            }

            public final Object component1() {
                return this.f56718a;
            }

            public final int component2() {
                return this.f56719b;
            }

            public final int component3() {
                return this.f56720c;
            }

            public final String component4() {
                return this.f56721d;
            }

            public final C0569a copy(Object obj, int i10, int i11, String tag) {
                kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
                return new C0569a(obj, i10, i11, tag);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0569a)) {
                    return false;
                }
                C0569a c0569a = (C0569a) obj;
                return kotlin.jvm.internal.e0.areEqual(this.f56718a, c0569a.f56718a) && this.f56719b == c0569a.f56719b && this.f56720c == c0569a.f56720c && kotlin.jvm.internal.e0.areEqual(this.f56721d, c0569a.f56721d);
            }

            public final int getEnd() {
                return this.f56720c;
            }

            public final Object getItem() {
                return this.f56718a;
            }

            public final int getStart() {
                return this.f56719b;
            }

            public final String getTag() {
                return this.f56721d;
            }

            public int hashCode() {
                Object obj = this.f56718a;
                return this.f56721d.hashCode() + e3.g.d(this.f56720c, e3.g.d(this.f56719b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
            }

            public final void setEnd(int i10) {
                this.f56720c = i10;
            }

            public final C0570b toRange(int i10) {
                int i11 = this.f56720c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Item.end should be set first");
                }
                return new C0570b(this.f56718a, this.f56719b, i10, this.f56721d);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("MutableRange(item=");
                sb2.append(this.f56718a);
                sb2.append(", start=");
                sb2.append(this.f56719b);
                sb2.append(", end=");
                sb2.append(this.f56720c);
                sb2.append(", tag=");
                return o2.q(sb2, this.f56721d, ')');
            }

            public /* synthetic */ C0569a(Object obj, int i10, int i11, String str, int i12, kotlin.jvm.internal.u uVar) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public final void pop(int i10) {
            ArrayList arrayList = this.f56717e;
            if (i10 < arrayList.size()) {
                while (arrayList.size() - 1 >= i10) {
                    pop();
                }
            } else {
                throw new IllegalStateException((i10 + " should be less than " + arrayList.size()).toString());
            }
        }

        public final int pushStyle(x style) {
            kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
            C0569a c0569a = new C0569a(style, this.f56713a.length(), 0, null, 12, null);
            this.f56717e.add(c0569a);
            this.f56715c.add(c0569a);
            return r9.size() - 1;
        }

        public /* synthetic */ a(int i10, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String text) {
            this(0, 1, null);
            kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
            append(text);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(b text) {
            this(0, 1, null);
            kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
            append(text);
        }
    }

    public b(String text, List<C0570b> spanStyles, List<C0570b> paragraphStyles, List<? extends C0570b> annotations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyles, "spanStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphStyles, "paragraphStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(annotations, "annotations");
        this.f56709b = text;
        this.f56710c = spanStyles;
        this.f56711e = paragraphStyles;
        this.f56712f = annotations;
        int size = paragraphStyles.size();
        int end = -1;
        for (int i10 = 0; i10 < size; i10++) {
            C0570b c0570b = paragraphStyles.get(i10);
            if (c0570b.getStart() < end) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (c0570b.getEnd() > this.f56709b.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + c0570b.getStart() + ", " + c0570b.getEnd() + ") is out of boundary").toString());
            }
            end = c0570b.getEnd();
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56709b, bVar.f56709b) && kotlin.jvm.internal.e0.areEqual(this.f56710c, bVar.f56710c) && kotlin.jvm.internal.e0.areEqual(this.f56711e, bVar.f56711e) && kotlin.jvm.internal.e0.areEqual(this.f56712f, bVar.f56712f);
    }

    public char get(int i10) {
        return this.f56709b.charAt(i10);
    }

    public final List<C0570b> getAnnotations$ui_text_release() {
        return this.f56712f;
    }

    public int getLength() {
        return this.f56709b.length();
    }

    public final List<C0570b> getParagraphStyles() {
        return this.f56711e;
    }

    public final List<C0570b> getSpanStyles() {
        return this.f56710c;
    }

    public final List<C0570b> getStringAnnotations(String tag, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        List list = this.f56712f;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C0570b c0570b = (C0570b) obj;
            if ((c0570b.getItem() instanceof String) && kotlin.jvm.internal.e0.areEqual(tag, c0570b.getTag()) && g.intersect(i10, i11, c0570b.getStart(), c0570b.getEnd())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getText() {
        return this.f56709b;
    }

    public final List<C0570b> getTtsAnnotations(int i10, int i11) {
        List list = this.f56712f;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C0570b c0570b = (C0570b) obj;
            if ((c0570b.getItem() instanceof f2) && g.intersect(i10, i11, c0570b.getStart(), c0570b.getEnd())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f56712f.hashCode() + j1.o2.c(j1.o2.c(this.f56709b.hashCode() * 31, 31, this.f56710c), 31, this.f56711e);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final b plus(b other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        a aVar = new a(this);
        aVar.append(other);
        return aVar.toAnnotatedString();
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final b m3965subSequence5zctL8(long j10) {
        return subSequence(a2.m3958getMinimpl(j10), a2.m3957getMaximpl(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f56709b;
    }

    @Override // java.lang.CharSequence
    public b subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        }
        String str = this.f56709b;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new b(strSubstring, g.access$filterRanges(this.f56710c, i10, i11), g.access$filterRanges(this.f56711e, i10, i11), g.access$filterRanges(this.f56712f, i10, i11));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: g2.b$b, reason: collision with other inner class name */
    public static final class C0570b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f56722a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56723b;

        /* renamed from: c, reason: collision with root package name */
        public final int f56724c;

        /* renamed from: d, reason: collision with root package name */
        public final String f56725d;

        public C0570b(Object obj, int i10, int i11, String tag) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            this.f56722a = obj;
            this.f56723b = i10;
            this.f56724c = i11;
            this.f56725d = tag;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public static /* synthetic */ C0570b copy$default(C0570b c0570b, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = c0570b.f56722a;
            }
            if ((i12 & 2) != 0) {
                i10 = c0570b.f56723b;
            }
            if ((i12 & 4) != 0) {
                i11 = c0570b.f56724c;
            }
            if ((i12 & 8) != 0) {
                str = c0570b.f56725d;
            }
            return c0570b.copy(obj, i10, i11, str);
        }

        public final Object component1() {
            return this.f56722a;
        }

        public final int component2() {
            return this.f56723b;
        }

        public final int component3() {
            return this.f56724c;
        }

        public final String component4() {
            return this.f56725d;
        }

        public final C0570b copy(Object obj, int i10, int i11, String tag) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            return new C0570b(obj, i10, i11, tag);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0570b)) {
                return false;
            }
            C0570b c0570b = (C0570b) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f56722a, c0570b.f56722a) && this.f56723b == c0570b.f56723b && this.f56724c == c0570b.f56724c && kotlin.jvm.internal.e0.areEqual(this.f56725d, c0570b.f56725d);
        }

        public final int getEnd() {
            return this.f56724c;
        }

        public final Object getItem() {
            return this.f56722a;
        }

        public final int getStart() {
            return this.f56723b;
        }

        public final String getTag() {
            return this.f56725d;
        }

        public int hashCode() {
            Object obj = this.f56722a;
            return this.f56725d.hashCode() + e3.g.d(this.f56724c, e3.g.d(this.f56723b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.f56722a);
            sb2.append(", start=");
            sb2.append(this.f56723b);
            sb2.append(", end=");
            sb2.append(this.f56724c);
            sb2.append(", tag=");
            return o2.q(sb2, this.f56725d, ')');
        }

        public C0570b(Object obj, int i10, int i11) {
            this(obj, i10, i11, "");
        }
    }

    public final List<C0570b> getStringAnnotations(int i10, int i11) {
        List list = this.f56712f;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C0570b c0570b = (C0570b) obj;
            if ((c0570b.getItem() instanceof String) && g.intersect(i10, i11, c0570b.getStart(), c0570b.getEnd())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* synthetic */ b(String str, List list, List list2, List list3, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? uu.p0.emptyList() : list, (i10 & 4) != 0 ? uu.p0.emptyList() : list2, (i10 & 8) != 0 ? uu.p0.emptyList() : list3);
    }

    public /* synthetic */ b(String str, List list, List list2, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? uu.p0.emptyList() : list, (i10 & 4) != 0 ? uu.p0.emptyList() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String text, List<C0570b> spanStyles, List<C0570b> paragraphStyles) {
        this(text, spanStyles, paragraphStyles, uu.p0.emptyList());
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyles, "spanStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphStyles, "paragraphStyles");
    }
}
