package ku;

import ao.kwoC.zAQQWzBxnS;
import iu.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mt.a0;
import p0.o2;
import st.q;
import ut.m0;
import ut.o0;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h implements pt.c {

    /* renamed from: f, reason: collision with root package name */
    public long f72022f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f72023g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f72024h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f72025i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f72026j;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f72020c = new b0();

    /* renamed from: e, reason: collision with root package name */
    public final b0 f72021e = new b0();

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f72019b = new CountDownLatch(1);

    public final AssertionError a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (latch = ");
        sb2.append(this.f72019b.getCount());
        sb2.append(", values = ");
        sb2.append(this.f72020c.size());
        sb2.append(", errors = ");
        b0 b0Var = this.f72021e;
        sb2.append(b0Var.size());
        sb2.append(", completions = ");
        sb2.append(this.f72022f);
        if (this.f72026j) {
            sb2.append(", timeout!");
        }
        if (isDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.f72025i;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!b0Var.isEmpty()) {
            if (b0Var.size() == 1) {
                assertionError.initCause((Throwable) b0Var.get(0));
                return assertionError;
            }
            assertionError.initCause(new qt.c(b0Var));
        }
        return assertionError;
    }

    public final h assertComplete() {
        long j10 = this.f72022f;
        if (j10 == 0) {
            throw a("Not completed");
        }
        if (j10 <= 1) {
            return this;
        }
        throw a("Multiple completions: " + j10);
    }

    public final h assertEmpty() {
        return assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final h assertError(Throwable th2) {
        return assertError(m0.equalsWith(th2));
    }

    public final h assertErrorMessage(String str) {
        b0 b0Var = this.f72021e;
        int size = b0Var.size();
        if (size == 0) {
            throw a("No errors");
        }
        if (size != 1) {
            throw a("Multiple errors");
        }
        String message = ((Throwable) b0Var.get(0)).getMessage();
        if (o0.equals(str, message)) {
            return this;
        }
        throw a("Error message differs; exptected: " + str + " but was: " + message);
    }

    public final h assertFailure(Class<? extends Throwable> cls, Object... objArr) {
        return assertSubscribed().assertValues(objArr).assertError(cls).assertNotComplete();
    }

    public final h assertFailureAndMessage(Class<? extends Throwable> cls, String str, Object... objArr) {
        return assertSubscribed().assertValues(objArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final h assertNever(Object obj) {
        b0 b0Var = this.f72020c;
        int size = b0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (o0.equals(b0Var.get(i10), obj)) {
                StringBuilder sbT = o2.t(i10, "Value at position ", " is equal to ");
                sbT.append(valueAndClass(obj));
                sbT.append("; Expected them to be different");
                throw a(sbT.toString());
            }
        }
        return this;
    }

    public final h assertNoErrors() {
        b0 b0Var = this.f72021e;
        if (b0Var.size() == 0) {
            return this;
        }
        throw a("Error(s) present: " + b0Var);
    }

    public final h assertNoValues() {
        return assertValueCount(0);
    }

    public final h assertNotComplete() {
        long j10 = this.f72022f;
        if (j10 == 1) {
            throw a("Completed!");
        }
        if (j10 <= 1) {
            return this;
        }
        throw a("Multiple completions: " + j10);
    }

    public abstract h assertNotSubscribed();

    public final h assertNotTerminated() {
        if (this.f72019b.getCount() != 0) {
            return this;
        }
        throw a("Subscriber terminated!");
    }

    public final h assertResult(Object... objArr) {
        return assertSubscribed().assertValues(objArr).assertNoErrors().assertComplete();
    }

    public abstract h assertSubscribed();

    public final h assertTerminated() {
        if (this.f72019b.getCount() != 0) {
            throw a("Subscriber still running!");
        }
        long j10 = this.f72022f;
        if (j10 > 1) {
            throw a("Terminated with multiple completions: " + j10);
        }
        int size = this.f72021e.size();
        if (size > 1) {
            throw a("Terminated with multiple errors: " + size);
        }
        if (j10 == 0 || size == 0) {
            return this;
        }
        throw a("Terminated with multiple completions and errors: " + j10);
    }

    public final h assertTimeout() {
        if (this.f72026j) {
            return this;
        }
        throw a("No timeout?!");
    }

    public final h assertValue(Object obj) {
        b0 b0Var = this.f72020c;
        if (b0Var.size() != 1) {
            throw a("expected: " + valueAndClass(obj) + " but was: " + b0Var);
        }
        Object obj2 = b0Var.get(0);
        if (o0.equals(obj, obj2)) {
            return this;
        }
        throw a("expected: " + valueAndClass(obj) + " but was: " + valueAndClass(obj2));
    }

    public final h assertValueAt(int i10, Object obj) {
        b0 b0Var = this.f72020c;
        int size = b0Var.size();
        if (size == 0) {
            throw a("No values");
        }
        if (i10 >= size) {
            throw a("Invalid index: " + i10);
        }
        Object obj2 = b0Var.get(i10);
        if (o0.equals(obj, obj2)) {
            return this;
        }
        throw a("expected: " + valueAndClass(obj) + " but was: " + valueAndClass(obj2));
    }

    public final h assertValueCount(int i10) {
        int size = this.f72020c.size();
        if (size == i10) {
            return this;
        }
        throw a("Value counts differ; expected: " + i10 + " but was: " + size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r2 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        throw a("Fewer values received than expected (" + r1 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        throw a("More values received than expected (" + r1 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ku.h assertValueSequence(java.lang.Iterable<java.lang.Object> r6) {
        /*
            r5 = this;
            iu.b0 r0 = r5.f72020c
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        Lb:
            boolean r2 = r6.hasNext()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4d
            if (r2 != 0) goto L18
            goto L4d
        L18:
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r0.next()
            boolean r4 = ut.o0.equals(r2, r3)
            if (r4 == 0) goto L29
            int r1 = r1 + 1
            goto Lb
        L29:
            java.lang.String r6 = "Values at position "
            java.lang.String r0 = " differ; expected: "
            java.lang.StringBuilder r6 = p0.o2.t(r1, r6, r0)
            java.lang.String r0 = valueAndClass(r2)
            r6.append(r0)
            java.lang.String r0 = " but was: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r3)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.a(r6)
            throw r6
        L4d:
            java.lang.String r6 = ")"
            if (r3 != 0) goto L6a
            if (r2 != 0) goto L54
            return r5
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Fewer values received than expected ("
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.a(r6)
            throw r6
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "More values received than expected ("
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.a(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ku.h.assertValueSequence(java.lang.Iterable):ku.h");
    }

    public final h assertValueSequenceOnly(Iterable<Object> iterable) {
        return assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final h assertValueSet(Collection<Object> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (Object obj : this.f72020c) {
            if (!collection.contains(obj)) {
                throw a("Value not in the expected collection: " + valueAndClass(obj));
            }
        }
        return this;
    }

    public final h assertValueSetOnly(Collection<Object> collection) {
        return assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final h assertValues(Object... objArr) {
        b0 b0Var = this.f72020c;
        int size = b0Var.size();
        if (size != objArr.length) {
            throw a("Value count differs; expected: " + objArr.length + " " + Arrays.toString(objArr) + " but was: " + size + " " + b0Var);
        }
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = b0Var.get(i10);
            Object obj2 = objArr[i10];
            if (!o0.equals(obj2, obj)) {
                StringBuilder sbT = o2.t(i10, "Values at position ", " differ; expected: ");
                sbT.append(valueAndClass(obj2));
                sbT.append(" but was: ");
                sbT.append(valueAndClass(obj));
                throw a(sbT.toString());
            }
        }
        return this;
    }

    public final h assertValuesOnly(Object... objArr) {
        return assertSubscribed().assertValues(objArr).assertNoErrors().assertNotComplete();
    }

    public final h await() throws InterruptedException {
        CountDownLatch countDownLatch = this.f72019b;
        if (countDownLatch.getCount() == 0) {
            return this;
        }
        countDownLatch.await();
        return this;
    }

    public final h awaitCount(int i10) {
        return awaitCount(i10, g.f72017b, 5000L);
    }

    public final h awaitDone(long j10, TimeUnit timeUnit) {
        try {
            if (this.f72019b.await(j10, timeUnit)) {
                return this;
            }
            this.f72026j = true;
            dispose();
            return this;
        } catch (InterruptedException e10) {
            dispose();
            throw iu.m.wrapOrThrow(e10);
        }
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final h clearTimeout() {
        this.f72026j = false;
        return this;
    }

    public final long completions() {
        return this.f72022f;
    }

    @Override // pt.c
    public abstract /* synthetic */ void dispose();

    public final int errorCount() {
        return this.f72021e.size();
    }

    public final List<Throwable> errors() {
        return this.f72021e;
    }

    public final List<List<Object>> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        ArrayList arrayList2 = new ArrayList();
        for (long j10 = 0; j10 < this.f72022f; j10++) {
            arrayList2.add(a0.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override // pt.c
    public abstract /* synthetic */ boolean isDisposed();

    public final boolean isTerminated() {
        return this.f72019b.getCount() == 0;
    }

    public final boolean isTimeout() {
        return this.f72026j;
    }

    public final Thread lastThread() {
        return this.f72023g;
    }

    public final int valueCount() {
        return this.f72020c.size();
    }

    public final List<Object> values() {
        return this.f72020c;
    }

    public final h withTag(CharSequence charSequence) {
        this.f72025i = charSequence;
        return this;
    }

    public static String valueAndClass(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return obj + VPCjETNfjxu.GBlnFVFeqYTwCr + obj.getClass().getSimpleName() + ")";
    }

    public final h assertError(Class<? extends Throwable> cls) {
        return assertError(m0.isInstanceOf(cls));
    }

    public final h assertNoTimeout() {
        if (this.f72026j) {
            throw a(zAQQWzBxnS.Uxt);
        }
        return this;
    }

    public final h awaitCount(int i10, Runnable runnable) {
        return awaitCount(i10, runnable, 5000L);
    }

    public final h assertError(q qVar) {
        b0 b0Var = this.f72021e;
        int size = b0Var.size();
        if (size != 0) {
            Iterator it = b0Var.iterator();
            while (it.hasNext()) {
                try {
                    if (qVar.test((Throwable) it.next())) {
                        if (size == 1) {
                            return this;
                        }
                        throw a("Error present but other errors as well");
                    }
                } catch (Exception e10) {
                    throw iu.m.wrapOrThrow(e10);
                }
            }
            throw a("Error not present");
        }
        throw a("No errors");
    }

    public final boolean await(long j10, TimeUnit timeUnit) throws InterruptedException {
        CountDownLatch countDownLatch = this.f72019b;
        boolean z10 = countDownLatch.getCount() == 0 || countDownLatch.await(j10, timeUnit);
        this.f72026j = !z10;
        return z10;
    }

    public final h awaitCount(int i10, Runnable runnable, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j10 > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= j10) {
                this.f72026j = true;
                return this;
            }
            if (this.f72019b.getCount() == 0 || this.f72020c.size() >= i10) {
                break;
            }
            runnable.run();
        }
        return this;
    }

    public final boolean awaitTerminalEvent(long j10, TimeUnit timeUnit) {
        try {
            return await(j10, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final h assertFailure(q qVar, Object... objArr) {
        return assertSubscribed().assertValues(objArr).assertError(qVar).assertNotComplete();
    }

    public final h assertValue(q qVar) {
        assertValueAt(0, qVar);
        if (this.f72020c.size() <= 1) {
            return this;
        }
        throw a("Value present but other values as well");
    }

    public final h assertValueAt(int i10, q qVar) {
        b0 b0Var = this.f72020c;
        if (b0Var.size() != 0) {
            if (i10 < b0Var.size()) {
                try {
                    if (qVar.test(b0Var.get(i10))) {
                        return this;
                    }
                    throw a("Value not present");
                } catch (Exception e10) {
                    throw iu.m.wrapOrThrow(e10);
                }
            }
            throw a("Invalid index: " + i10);
        }
        throw a("No values");
    }

    public final h assertNever(q qVar) {
        b0 b0Var = this.f72020c;
        int size = b0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                if (qVar.test(b0Var.get(i10))) {
                    throw a("Value at position " + i10 + " matches predicate " + qVar.toString() + ", which was not expected.");
                }
            } catch (Exception e10) {
                throw iu.m.wrapOrThrow(e10);
            }
        }
        return this;
    }
}
