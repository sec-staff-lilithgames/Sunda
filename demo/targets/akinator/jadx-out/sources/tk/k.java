package tk;

import com.google.longrunning.ListOperationsRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k extends GeneratedMessageLite.Builder implements l {
    public k clearFilter() {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).clearFilter();
        return this;
    }

    public k clearName() {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).clearName();
        return this;
    }

    public k clearPageSize() {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).clearPageSize();
        return this;
    }

    public k clearPageToken() {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).clearPageToken();
        return this;
    }

    @Override // tk.l
    public String getFilter() {
        return ((ListOperationsRequest) this.instance).getFilter();
    }

    @Override // tk.l
    public ByteString getFilterBytes() {
        return ((ListOperationsRequest) this.instance).getFilterBytes();
    }

    @Override // tk.l
    public String getName() {
        return ((ListOperationsRequest) this.instance).getName();
    }

    @Override // tk.l
    public ByteString getNameBytes() {
        return ((ListOperationsRequest) this.instance).getNameBytes();
    }

    @Override // tk.l
    public int getPageSize() {
        return ((ListOperationsRequest) this.instance).getPageSize();
    }

    @Override // tk.l
    public String getPageToken() {
        return ((ListOperationsRequest) this.instance).getPageToken();
    }

    @Override // tk.l
    public ByteString getPageTokenBytes() {
        return ((ListOperationsRequest) this.instance).getPageTokenBytes();
    }

    public k setFilter(String str) {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).setFilter(str);
        return this;
    }

    public k setFilterBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).setFilterBytes(byteString);
        return this;
    }

    public k setName(String str) {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).setName(str);
        return this;
    }

    public k setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).setNameBytes(byteString);
        return this;
    }

    public k setPageSize(int i10) {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).setPageSize(i10);
        return this;
    }

    public k setPageToken(String str) {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).setPageToken(str);
        return this;
    }

    public k setPageTokenBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ListOperationsRequest) this.instance).setPageTokenBytes(byteString);
        return this;
    }
}
