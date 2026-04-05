package com.iabtcf.decoder;

import java.io.InputStream;
import java.util.function.Supplier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class LazySegmentFactory {
    private final String src;
    private SegmentSupplier sup = new SegmentSupplier();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class EmptyInputStream extends SegmentInputStream {
        public static EmptyInputStream INSTANCE = new EmptyInputStream();

        private EmptyInputStream() {
            super("", 0);
        }

        @Override // com.iabtcf.decoder.SegmentInputStream
        public boolean hasNextSegment() {
            return false;
        }

        @Override // com.iabtcf.decoder.SegmentInputStream
        public int segmentEnd() {
            return -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class SegmentSupplier implements Supplier<InputStream> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private SegmentInputStream current;
        private final SegmentSupplier prev;

        public SegmentSupplier() {
            this.prev = null;
            this.current = new SegmentInputStream(LazySegmentFactory.this.src, 0);
        }

        private SegmentInputStream getCurrent() {
            if (this.current == null) {
                SegmentInputStream current = this.prev.getCurrent();
                EmptyInputStream emptyInputStream = EmptyInputStream.INSTANCE;
                if (current == emptyInputStream) {
                    this.current = emptyInputStream;
                } else {
                    this.current = new SegmentInputStream(LazySegmentFactory.this.src, current.segmentEnd() + 1);
                }
            }
            return this.current;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.function.Supplier
        public InputStream get() {
            return getCurrent();
        }

        public SegmentSupplier(SegmentSupplier segmentSupplier) {
            this.prev = segmentSupplier;
        }
    }

    public LazySegmentFactory(String str) {
        this.src = str;
    }

    public Supplier<InputStream> next() {
        SegmentSupplier segmentSupplier = this.sup;
        this.sup = new SegmentSupplier(segmentSupplier);
        return segmentSupplier;
    }
}
