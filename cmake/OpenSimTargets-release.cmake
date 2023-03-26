#----------------------------------------------------------------
# Generated CMake target import file for configuration "Release".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "osimLepton" for configuration "Release"
set_property(TARGET osimLepton APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimLepton PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimLepton.lib"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimLepton.dll"
  )

list(APPEND _cmake_import_check_targets osimLepton )
list(APPEND _cmake_import_check_files_for_osimLepton "${_IMPORT_PREFIX}/sdk/lib/osimLepton.lib" "${_IMPORT_PREFIX}/bin/osimLepton.dll" )

# Import target "osimCommon" for configuration "Release"
set_property(TARGET osimCommon APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimCommon PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimCommon.lib"
  IMPORTED_LINK_DEPENDENT_LIBRARIES_RELEASE "ezc3d"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimCommon.dll"
  )

list(APPEND _cmake_import_check_targets osimCommon )
list(APPEND _cmake_import_check_files_for_osimCommon "${_IMPORT_PREFIX}/sdk/lib/osimCommon.lib" "${_IMPORT_PREFIX}/bin/osimCommon.dll" )

# Import target "osimSimulation" for configuration "Release"
set_property(TARGET osimSimulation APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimSimulation PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimSimulation.lib"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimSimulation.dll"
  )

list(APPEND _cmake_import_check_targets osimSimulation )
list(APPEND _cmake_import_check_files_for_osimSimulation "${_IMPORT_PREFIX}/sdk/lib/osimSimulation.lib" "${_IMPORT_PREFIX}/bin/osimSimulation.dll" )

# Import target "osimActuators" for configuration "Release"
set_property(TARGET osimActuators APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimActuators PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimActuators.lib"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimActuators.dll"
  )

list(APPEND _cmake_import_check_targets osimActuators )
list(APPEND _cmake_import_check_files_for_osimActuators "${_IMPORT_PREFIX}/sdk/lib/osimActuators.lib" "${_IMPORT_PREFIX}/bin/osimActuators.dll" )

# Import target "osimAnalyses" for configuration "Release"
set_property(TARGET osimAnalyses APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimAnalyses PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimAnalyses.lib"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimAnalyses.dll"
  )

list(APPEND _cmake_import_check_targets osimAnalyses )
list(APPEND _cmake_import_check_files_for_osimAnalyses "${_IMPORT_PREFIX}/sdk/lib/osimAnalyses.lib" "${_IMPORT_PREFIX}/bin/osimAnalyses.dll" )

# Import target "osimExampleComponents" for configuration "Release"
set_property(TARGET osimExampleComponents APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimExampleComponents PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimExampleComponents.lib"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimExampleComponents.dll"
  )

list(APPEND _cmake_import_check_targets osimExampleComponents )
list(APPEND _cmake_import_check_files_for_osimExampleComponents "${_IMPORT_PREFIX}/sdk/lib/osimExampleComponents.lib" "${_IMPORT_PREFIX}/bin/osimExampleComponents.dll" )

# Import target "osimTools" for configuration "Release"
set_property(TARGET osimTools APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimTools PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimTools.lib"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimTools.dll"
  )

list(APPEND _cmake_import_check_targets osimTools )
list(APPEND _cmake_import_check_files_for_osimTools "${_IMPORT_PREFIX}/sdk/lib/osimTools.lib" "${_IMPORT_PREFIX}/bin/osimTools.dll" )

# Import target "osimMoco" for configuration "Release"
set_property(TARGET osimMoco APPEND PROPERTY IMPORTED_CONFIGURATIONS RELEASE)
set_target_properties(osimMoco PROPERTIES
  IMPORTED_IMPLIB_RELEASE "${_IMPORT_PREFIX}/sdk/lib/osimMoco.lib"
  IMPORTED_LINK_DEPENDENT_LIBRARIES_RELEASE "casadi;tropter"
  IMPORTED_LOCATION_RELEASE "${_IMPORT_PREFIX}/bin/osimMoco.dll"
  )

list(APPEND _cmake_import_check_targets osimMoco )
list(APPEND _cmake_import_check_files_for_osimMoco "${_IMPORT_PREFIX}/sdk/lib/osimMoco.lib" "${_IMPORT_PREFIX}/bin/osimMoco.dll" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
