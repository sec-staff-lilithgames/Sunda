
/Users/siberia/Desktop/akinator/jadx-out/resources/lib/arm64-v8a/libpairipcore.so:	file format elf64-littleaarch64

Disassembly of section .text:

00000000000165b0 <.text>:
   5d720: fc624960     	ldr	d0, [x11, w2, uxtw]
   5d724: 1e610800     	fmul	d0, d0, d1
   5d728: 1b088cd0     	msub	w16, w6, w8, w3
   5d72c: d2803663     	mov	x3, #0x1b3              // =435
   5d730: f2c02003     	movk	x3, #0x100, lsl #32
   5d734: fc304960     	str	d0, [x11, w16, uxtw]
   5d738: f940014a     	ldr	x10, [x10]
   5d73c: 340001d1     	cbz	w17, 0x5d774 <.text+0x471c4>
   5d740: 4a0001d0     	eor	w16, w14, w0
   5d744: aa1f03eb     	mov	x11, xzr
   5d748: 1ac80a00     	udiv	w0, w16, w8
   5d74c: 1b08c010     	msub	w16, w0, w8, w16
   5d750: 52800020     	mov	w0, #0x1                // =1
   5d754: 8b100150     	add	x16, x10, x16
   5d758: 9b037c21     	mul	x1, x1, x3
   5d75c: 38ab6a02     	ldrsb	x2, [x16, x11]
   5d760: 93407c0b     	sxtw	x11, w0
   5d764: 71000631     	subs	w17, w17, #0x1
   5d768: 11000400     	add	w0, w0, #0x1
   5d76c: ca020021     	eor	x1, x1, x2
   5d770: 54ffff41     	b.ne	0x5d758 <.text+0x471a8>
   5d774: 4a0c01cb     	eor	w11, w14, w12
   5d778: 1ac8096c     	udiv	w12, w11, w8
   5d77c: 1b08ad8b     	msub	w11, w12, w8, w11
   5d780: b8ab494a     	ldrsw	x10, [x10, w11, uxtw]
   5d784: ca0a002a     	eor	x10, x1, x10
   5d788: eb0d015f     	cmp	x10, x13
   5d78c: 1a8901e9     	csel	w9, w15, w9, eq
