package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ec {

    /* renamed from: f, reason: collision with root package name */
    public static final ec f22093f = newBuilder().build();

    /* renamed from: a, reason: collision with root package name */
    public List f22094a;

    /* renamed from: b, reason: collision with root package name */
    public List f22095b;

    /* renamed from: c, reason: collision with root package name */
    public List f22096c;

    /* renamed from: d, reason: collision with root package name */
    public List f22097d;

    /* renamed from: e, reason: collision with root package name */
    public List f22098e;

    public static void a(ec ecVar, int i10, kd kdVar) throws IOException {
        ecVar.getClass();
        i0 i0Var = (i0) kdVar;
        if (i0Var.fieldOrder() != jd.f22281c) {
            Iterator it = ecVar.f22097d.iterator();
            while (it.hasNext()) {
                i0Var.writeMessageSetItem(i10, (ByteString) it.next());
            }
        } else {
            List list = ecVar.f22097d;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                i0Var.writeMessageSetItem(i10, listIterator.previous());
            }
        }
    }

    public static ec getDefaultInstance() {
        return f22093f;
    }

    public static dc newBuilder(ec ecVar) {
        return newBuilder().mergeFrom(ecVar);
    }

    public final void b(int i10, i0 i0Var) {
        i0Var.writeInt64List(i10, this.f22094a, false);
        i0Var.writeFixed32List(i10, this.f22095b, false);
        i0Var.writeFixed64List(i10, this.f22096c, false);
        i0Var.writeBytesList(i10, this.f22097d);
        if (i0Var.fieldOrder() == jd.f22280b) {
            for (int i11 = 0; i11 < this.f22098e.size(); i11++) {
                i0Var.writeStartGroup(i10);
                ((gc) this.f22098e.get(i11)).a(i0Var);
                i0Var.writeEndGroup(i10);
            }
            return;
        }
        for (int size = this.f22098e.size() - 1; size >= 0; size--) {
            i0Var.writeEndGroup(i10);
            ((gc) this.f22098e.get(size)).a(i0Var);
            i0Var.writeStartGroup(i10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return Arrays.equals(new Object[]{this.f22094a, this.f22095b, this.f22096c, this.f22097d, this.f22098e}, new Object[]{ecVar.f22094a, ecVar.f22095b, ecVar.f22096c, ecVar.f22097d, ecVar.f22098e});
    }

    public List<Integer> getFixed32List() {
        return this.f22095b;
    }

    public List<Long> getFixed64List() {
        return this.f22096c;
    }

    public List<gc> getGroupList() {
        return this.f22098e;
    }

    public List<ByteString> getLengthDelimitedList() {
        return this.f22097d;
    }

    public int getSerializedSize(int i10) {
        Iterator it = this.f22094a.iterator();
        int iComputeGroupSize = 0;
        while (it.hasNext()) {
            iComputeGroupSize += h0.computeUInt64Size(i10, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f22095b.iterator();
        while (it2.hasNext()) {
            iComputeGroupSize += h0.computeFixed32Size(i10, ((Integer) it2.next()).intValue());
        }
        Iterator it3 = this.f22096c.iterator();
        while (it3.hasNext()) {
            iComputeGroupSize += h0.computeFixed64Size(i10, ((Long) it3.next()).longValue());
        }
        Iterator it4 = this.f22097d.iterator();
        while (it4.hasNext()) {
            iComputeGroupSize += h0.computeBytesSize(i10, (ByteString) it4.next());
        }
        Iterator it5 = this.f22098e.iterator();
        while (it5.hasNext()) {
            iComputeGroupSize += h0.computeGroupSize(i10, (gc) it5.next());
        }
        return iComputeGroupSize;
    }

    public int getSerializedSizeAsMessageSetExtension(int i10) {
        Iterator it = this.f22097d.iterator();
        int iComputeRawMessageSetExtensionSize = 0;
        while (it.hasNext()) {
            iComputeRawMessageSetExtensionSize += h0.computeRawMessageSetExtensionSize(i10, (ByteString) it.next());
        }
        return iComputeRawMessageSetExtensionSize;
    }

    public List<Long> getVarintList() {
        return this.f22094a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22094a, this.f22095b, this.f22096c, this.f22097d, this.f22098e});
    }

    public ByteString toByteString(int i10) {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize(i10));
            writeTo(i10, codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a ByteString should never fail with an IOException", e10);
        }
    }

    public void writeAsMessageSetExtensionTo(int i10, h0 h0Var) throws IOException {
        Iterator it = this.f22097d.iterator();
        while (it.hasNext()) {
            h0Var.writeRawMessageSetExtension(i10, (ByteString) it.next());
        }
    }

    public void writeTo(int i10, h0 h0Var) throws IOException {
        Iterator it = this.f22094a.iterator();
        while (it.hasNext()) {
            h0Var.writeUInt64(i10, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f22095b.iterator();
        while (it2.hasNext()) {
            h0Var.writeFixed32(i10, ((Integer) it2.next()).intValue());
        }
        Iterator it3 = this.f22096c.iterator();
        while (it3.hasNext()) {
            h0Var.writeFixed64(i10, ((Long) it3.next()).longValue());
        }
        Iterator it4 = this.f22097d.iterator();
        while (it4.hasNext()) {
            h0Var.writeBytes(i10, (ByteString) it4.next());
        }
        Iterator it5 = this.f22098e.iterator();
        while (it5.hasNext()) {
            h0Var.writeGroup(i10, (gc) it5.next());
        }
    }

    public static dc newBuilder() {
        dc dcVar = new dc();
        dcVar.f22064a = new ec();
        return dcVar;
    }
}
