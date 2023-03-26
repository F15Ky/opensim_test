/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class provides a description of a mesh made of polygonal faces (not <br>
 * limited to triangles). Its primary purpose is for loading geometry from files, <br>
 * which can then be used for visualization or collision detection. For example, <br>
 * the following lines load a mesh from a Wavefront OBJ file, then create a <br>
 * DecorativeMesh from it.<br>
 * {@code 
    PolygonalMesh mesh;
    mesh.loadObjFile("teapot.obj");
    DecorativeMesh decoration(mesh);
} <br>
 * You can also read a polygon mesh from a VTK PolyData (.vtp) file, or an STL<br>
 * file (.stl) that is in ascii or binary format. You can also build meshes <br>
 * programmatically, and some static methods are provided here for generating some<br>
 * common shapes. If you don't know what kind of file you have, you can attempt to <br>
 * read it with the loadFile() method which will examine the file extension to <br>
 * determine the expected format.<br>
 * <br>
 * The mesh has its own local frame and vertex locations are given in that <br>
 * frame. You can scale and transform the vertices relative to that frame <br>
 * (changing the values stored in the mesh) but more commonly the mesh will be<br>
 * placed on a body relative to that body's frame, meaning you can re-use the<br>
 * same mesh in various places.<br>
 * <br>
 * We expect this to be a large object so give it shared (reference) semantics; <br>
 * that is, the copy constructor and copy assignment default to shallow copies <br>
 * (both handles will refer to the same data). If you want to make a deep <br>
 * (non-shared) copy of a PolygonalMesh, use the copyAssign() method provided by <br>
 * the PIMPLHandle base class. *
 */
public class PolygonalMesh {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public PolygonalMesh(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PolygonalMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_PolygonalMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Create an empty %PolygonalMesh, with no vertices or faces. *
   */
  public PolygonalMesh() {
    this(opensimSimbodyJNI.new_PolygonalMesh(), true);
  }

  /**
   *  Create a sphere-shaped mesh, with roughly uniform mesh elements.<br>
   * <br>
   *     @param radius<br>
   *         The radius of the underlying sphere. Vertices of the mesh will be on<br>
   *         the sphere, with mesh elements somewhat inside.<br>
   *     @param resolution  <br>
   *         Control for how dense a mesh to produce. Resolution 0 will produce an<br>
   *         octahedron (8 triangular faces). Resolution 1 (the default) gives <br>
   *         32 faces, resolution 2 gives 128. In general for resolution n there <br>
   *         will be 2*4^(n+1) faces.<br>
   *     @return A %PolygonalMesh representing a sphere of the specified radius. *
   */
  public static PolygonalMesh createSphereMesh(double radius, int resolution) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_createSphereMesh__SWIG_0(radius, resolution), true);
  }

  /**
   *  Create a sphere-shaped mesh, with roughly uniform mesh elements.<br>
   * <br>
   *     @param radius<br>
   *         The radius of the underlying sphere. Vertices of the mesh will be on<br>
   *         the sphere, with mesh elements somewhat inside.<br>
   *     @return A %PolygonalMesh representing a sphere of the specified radius. *
   */
  public static PolygonalMesh createSphereMesh(double radius) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_createSphereMesh__SWIG_1(radius), true);
  }

  /**
   *  Create a brick-shaped mesh. A brick is a rectangular solid (a box)<br>
   *     centered at and aligned with the mesh local frame. Note that its size is <br>
   *     given with <i>half</i> dimensions. By default you will just get two mesh faces<br>
   *     along the longest edge of the brick, with all other edges roughly the same<br>
   *     size. You can control the mesh density with the <i>resolution</i> parameter.<br>
   * <br>
   *     @param halfDims    <br>
   *         The half-dimensions of the brick. The extreme vertices are at <br>
   *         -halfDims and +halfDims, so the brick is centered around the mesh <br>
   *         local frame.<br>
   *     @param resolution  <br>
   *         Control for how dense a mesh to produce. For this shape, <i>resolution</i><br>
   *         is interpreted as the number of extra vertices to insert in the <br>
   *         <i>longest</i> edge of the brick. Extra vertices are inserted into the<br>
   *         shorter edges if needed to keep the edge lengths approximately<br>
   *         uniform for every mesh face. <i>resolution=0</i> gives only<br>
   *         vertices at the corners; the default is 1 meaning that the longest<br>
   *         edge is split once.<br>
   *     @return A %PolygonalMesh representing a brick of the requested size. <br>
   * <br>
   *     <h3>Controlling the mesh density:</h3><br>
   *     If you want a brick mesh where all the edges in the mesh are roughly the <br>
   *     same length, say <code>wantEdgeLength</code>, set <i>resolution</i> like this:<br>
   *     {@code 
      Real wantEdgeLength = ...;
      Vec3 halfDims = ...;
      int resolution = (int)(max(halfDims)/wantEdgeLength + 0.5);
      }<br>
   * <br>
   *     If you want a brick mesh where all the edges are roughly the same length<br>
   *     as the shortest edge of the brick, just set <br>
   *     <code>wantEdgeLength=min(halfDims)</code> in the above calculation. *
   */
  public static PolygonalMesh createBrickMesh(Vec3 halfDims, int resolution) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_createBrickMesh__SWIG_0(Vec3.getCPtr(halfDims), halfDims, resolution), true);
  }

  /**
   *  Create a brick-shaped mesh. A brick is a rectangular solid (a box)<br>
   *     centered at and aligned with the mesh local frame. Note that its size is <br>
   *     given with <i>half</i> dimensions. By default you will just get two mesh faces<br>
   *     along the longest edge of the brick, with all other edges roughly the same<br>
   *     size. You can control the mesh density with the <i>resolution</i> parameter.<br>
   * <br>
   *     @param halfDims    <br>
   *         The half-dimensions of the brick. The extreme vertices are at <br>
   *         -halfDims and +halfDims, so the brick is centered around the mesh <br>
   *         local frame.<br>
   *     @return A %PolygonalMesh representing a brick of the requested size. <br>
   * <br>
   *     <h3>Controlling the mesh density:</h3><br>
   *     If you want a brick mesh where all the edges in the mesh are roughly the <br>
   *     same length, say <code>wantEdgeLength</code>, set <i>resolution</i> like this:<br>
   *     {@code 
      Real wantEdgeLength = ...;
      Vec3 halfDims = ...;
      int resolution = (int)(max(halfDims)/wantEdgeLength + 0.5);
      }<br>
   * <br>
   *     If you want a brick mesh where all the edges are roughly the same length<br>
   *     as the shortest edge of the brick, just set <br>
   *     <code>wantEdgeLength=min(halfDims)</code> in the above calculation. *
   */
  public static PolygonalMesh createBrickMesh(Vec3 halfDims) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_createBrickMesh__SWIG_1(Vec3.getCPtr(halfDims), halfDims), true);
  }

  /**
   *  Create a cylinder-shaped mesh, with the long axis in a given <br>
   *     direction. By default you'll get a 12 sided polygon as the base and <br>
   *     elements of roughly similar dimension along the edges. You can control the<br>
   *     mesh density with the <i>resolution</i> parameter.<br>
   * <br>
   *     @param axis<br>
   *         The central axis direction of the cylinder, in the mesh local frame.<br>
   *         This can be provided using the constants XAxis, YAxis, or ZAxis, or<br>
   *         you can provide a unit vector in any direction.<br>
   *     @param radius<br>
   *         The cylinder radius.<br>
   *     @param halfLength    <br>
   *         Half the length of the cylinder along its axis. The bases are at <br>
   *         -halfLength and +halfLength along the <i>axis</i>, so the cylinder is <br>
   *         centered around the mesh local frame origin.<br>
   *     @param resolution  <br>
   *         Control for how dense a mesh to produce (see below for details). <br>
   *     @return A %PolygonalMesh representing a cylinder of the requested dimensions<br>
   *         and orientation.     <br>
   * <br>
   *     <h3>Controlling the mesh density:</h3>    <br>
   *     At resolution 0 the base is a hexagon with six triangular faces, and the <br>
   *     tube is meshed with quad faces that are about as long<br>
   *     as the diameter of the base. Resolution 1 (the default) makes the base<br>
   *     a 12-sided polygon and introduces an intermediate 12-sided polygon of <br>
   *     have the diameter. There will be triangles in the center still, but<br>
   *     quad faces between the polygons. The length of the tube faces will be<br>
   *     reduced to match. Higher resolutions refine the mesh similarly. *
   */
  public static PolygonalMesh createCylinderMesh(UnitVec3 axis, double radius, double halfLength, int resolution) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_createCylinderMesh__SWIG_0(UnitVec3.getCPtr(axis), axis, radius, halfLength, resolution), true);
  }

  /**
   *  Create a cylinder-shaped mesh, with the long axis in a given <br>
   *     direction. By default you'll get a 12 sided polygon as the base and <br>
   *     elements of roughly similar dimension along the edges. You can control the<br>
   *     mesh density with the <i>resolution</i> parameter.<br>
   * <br>
   *     @param axis<br>
   *         The central axis direction of the cylinder, in the mesh local frame.<br>
   *         This can be provided using the constants XAxis, YAxis, or ZAxis, or<br>
   *         you can provide a unit vector in any direction.<br>
   *     @param radius<br>
   *         The cylinder radius.<br>
   *     @param halfLength    <br>
   *         Half the length of the cylinder along its axis. The bases are at <br>
   *         -halfLength and +halfLength along the <i>axis</i>, so the cylinder is <br>
   *         centered around the mesh local frame origin.<br>
   *     @return A %PolygonalMesh representing a cylinder of the requested dimensions<br>
   *         and orientation.     <br>
   * <br>
   *     <h3>Controlling the mesh density:</h3>    <br>
   *     At resolution 0 the base is a hexagon with six triangular faces, and the <br>
   *     tube is meshed with quad faces that are about as long<br>
   *     as the diameter of the base. Resolution 1 (the default) makes the base<br>
   *     a 12-sided polygon and introduces an intermediate 12-sided polygon of <br>
   *     have the diameter. There will be triangles in the center still, but<br>
   *     quad faces between the polygons. The length of the tube faces will be<br>
   *     reduced to match. Higher resolutions refine the mesh similarly. *
   */
  public static PolygonalMesh createCylinderMesh(UnitVec3 axis, double radius, double halfLength) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_createCylinderMesh__SWIG_1(UnitVec3.getCPtr(axis), axis, radius, halfLength), true);
  }

  /**
   *  Restore this %PolygonalMesh to its default-constructed state, meaning<br>
   *     that it will contain no vertices or faces after this call. *
   */
  public void clear() {
    opensimSimbodyJNI.PolygonalMesh_clear(swigCPtr, this);
  }

  /**
   *  Get the number of faces in the mesh. *
   */
  public int getNumFaces() {
    return opensimSimbodyJNI.PolygonalMesh_getNumFaces(swigCPtr, this);
  }

  /**
   *  Get the number of vertices in the mesh. *
   */
  public int getNumVertices() {
    return opensimSimbodyJNI.PolygonalMesh_getNumVertices(swigCPtr, this);
  }

  /**
   *  Get the position of a vertex in the mesh.<br>
   *     @param vertex  The index of the vertex (as returned by addVertex()).<br>
   *     @return The position of the specified vertex, measured and expressed in<br>
   *     the mesh local frame. *
   */
  public Vec3 getVertexPosition(int vertex) {
    return new Vec3(opensimSimbodyJNI.PolygonalMesh_getVertexPosition(swigCPtr, this, vertex), false);
  }

  /**
   *  Get the number of vertices that make up a particular face.<br>
   *     @param face    The index of the face (as returned by addFace()). *
   */
  public int getNumVerticesForFace(int face) {
    return opensimSimbodyJNI.PolygonalMesh_getNumVerticesForFace(swigCPtr, this, face);
  }

  /**
   *  Get the index of one of the vertices of a face.<br>
   *     @param face    The index of the face (as returned by addFace()).<br>
   *     @param vertex  The index of the vertex within the face (from 0, 1, or 2 <br>
   *                         for a triangular face, etc.) These are ordered the same<br>
   *                         way as when the face was defined.<br>
   *     @return The index of the specified vertex. *
   */
  public int getFaceVertex(int face, int vertex) {
    return opensimSimbodyJNI.PolygonalMesh_getFaceVertex(swigCPtr, this, face, vertex);
  }

  /**
   *  Add a vertex to the mesh.<br>
   *     @param position   The position of the vertex to add, measured and <br>
   *                            expressed in the mesh local frame.<br>
   *     @return The index of the newly added vertex. *
   */
  public int addVertex(Vec3 position) {
    return opensimSimbodyJNI.PolygonalMesh_addVertex(swigCPtr, this, Vec3.getCPtr(position), position);
  }

  /**
   *  Add a face to the mesh. Note that the ordering of the vertices defines<br>
   *     the outward normal for the face; they must be counterclockwise around the<br>
   *     desired normal.<br>
   * <br>
   *     @param vertices    Indices of the vertices which make up the new face, <br>
   *                             in counterclockwise order with respect to the face <br>
   *                             normal.<br>
   *     @return The index of the newly added face. *
   */
  public int addFace(SimTKArrayInt vertices) {
    return opensimSimbodyJNI.PolygonalMesh_addFace(swigCPtr, this, SimTKArrayInt.getCPtr(vertices), vertices);
  }

  /**
   *  Scale a mesh by multiplying every vertex by a fixed value. Note that<br>
   *     this permanently modifies the vertex locations within the mesh. Since the<br>
   *     vertices are measured in the mesh local frame, scaling will appear to <br>
   *     occur around the mesh origin (that is, the origin will remain where it<br>
   *     was while everything else changes. <br>
   *     @param scale   The scale factor. Can be any value except zero. <br>
   *     @return A reference to this now-scaled mesh object. *
   */
  public PolygonalMesh scaleMesh(double scale) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_scaleMesh(swigCPtr, this, scale), false);
  }

  /**
   *  %Transform a mesh by applying the given Transform to every vertex, <br>
   *     leaving the mesh permanently changed. This has the effect of replacing the<br>
   *     mesh local frame M with a new frame A.<br>
   *     @param X_AM   The transform giving the pose of the mesh local frame in<br>
   *                        the new frame A. Every vertex v_M becomes v_A=X_AM*v_M.<br>
   *     @return A reference to this now-transformed mesh object. *
   */
  public PolygonalMesh transformMesh(Transform X_AM) {
    return new PolygonalMesh(opensimSimbodyJNI.PolygonalMesh_transformMesh(swigCPtr, this, Transform.getCPtr(X_AM), X_AM), false);
  }

  /**
   *  Attempt to interpret the given file as a mesh file, with the format<br>
   *     determined from the file name extension. If we recognize the extension <br>
   *     we'll call one of the specialized methods below; see the descriptions for<br>
   *     more information. Ignoring case, we recognize:<br>
   *         - <tt>.obj </tt>: Wavefront OBJ file<br>
   *         - <tt>.stl </tt>: 3D Systems Stereolithography file (ascii or binary)<br>
   *         - <tt>.stla</tt>: ascii-only stl extension<br>
   *         - <tt>.vtp </tt>: VTK PolyData file (we can only read the ascii version)<br>
   * <br>
   *     @param pathname    The name of a mesh file with a recognized extension.
   */
  public void loadFile(String pathname) {
    opensimSimbodyJNI.PolygonalMesh_loadFile(swigCPtr, this, pathname);
  }

}