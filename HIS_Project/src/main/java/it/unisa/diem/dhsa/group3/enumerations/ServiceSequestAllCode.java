package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Enumeration to represent valid values for the request codes of the ServiceRequest.
 *
 */
public enum ServiceSequestAllCode {
	
	_104001, /*Excision of lesion of patella*/
	_115006, /*Fit removable orthodontic appliance*/
	_119000, /*Thoracoscopic partial lobectomy of lung*/
	_121005, /*Retrobulbar injection of therapeutic agent*/
	_128004, /*Hand microscope examination of skin*/
	_133000, /*Percutaneous implantation of neurostimulator electrodes into neuromuscular component*/
	_135007, /*Arthrotomy of wrist joint with exploration and biopsy*/
	_142007, /*Excision of tumor from shoulder area,  deep,  intramuscular*/
	_146005, /*Repair of nonunion of metatarsal with bone graft*/
	_153001, /*Cystourethroscopy with resection of ureterocele*/
	_160007, /*Removal of foreign body of tendon and/or tendon sheath*/
	_166001, /*Behavioral therapy*/
	_170009, /*Special potency disk identification,  vancomycin test*/
	_174000, /*Harrison-Richardson operation on vagina*/
	_176003, /*Anastomosis of rectum*/
	_189009, /*Excision of lesion of artery*/
	_197002, /*Mold to yeast conversion test*/
	_230009, /*Miller operation,  urethrovesical suspension*/
	_243009, /*Replacement of cerebral ventricular tube*/
	_245002, /*Division of nerve ganglion*/
	_262007, /*Percutaneous aspiration of renal pelvis*/
	_267001, /*Anal fistulectomy,  multiple*/
	_285008, /*Incision and drainage of vulva*/
	_294002, /*Excisional biopsy of joint structure of spine*/
	_295001, /*Nonexcisional destruction of cyst of ciliary body*/
	_306005, /*US kidneys*/
	_316002, /*Partial dacryocystectomy*/
	_334003, /*Panorex examination of mandible*/
	_342002, /*Amobarbital interview*/
	_346004, /*Periodontal scaling and root planing,  per quadrant*/
	_348003, /*Radionuclide dynamic function study*/
	_351005, /*Urinary undiversion of ureteral anastomosis*/
	_352003, /*Reagent RBC,  preparation antibody sensitized pool*/
	_353008, /*IV/irrigation monitoring*/
	_374009, /*Costosternoplasty for pectus excavatum repair*/
	_388008, /*Blepharorrhaphy*/
	_389000, /*Tobramycin level*/
	_401004, /*Distal subtotal pancreatectomy*/
	_406009, /*Fulguration of stomach lesion*/
	_417005, /*Hospital re-admission*/
	_435001, /*Pulmonary inhalation study*/
	_445004, /*Repair of malunion of tibia*/
	_456004, /*Total abdominal colectomy with ileostomy*/
	_459006, /*Closed condylotomy of mandible*/
	_463004, /*Closed reduction of coxofemoral joint dislocation with splint*/
	_468008, /*Glutathione measurement*/
	_474008, /*Esophagoenteric anastomosis,  intrathoracic*/
	_489004, /*Ferritin level*/
	_493005, /*Urobilinogen measurement,  48-hour,  feces*/
	_494004, /*Excision of lesion of tonsil*/
	_497006, /*Replacement of cochlear prosthesis,  multiple channels*/
	_503003, /*Corneal gluing*/
	_531007, /*Open pulmonary valve commissurotomy with inflow occlusion*/
	_533005, /*Repair of vesicocolic fistula*/
	_535003, /*Closure of ureterovesicovaginal fistula*/
	_540006, /*Antibody to single and double stranded DNA measurement*/
	_543008, /*Choledochostomy with transduodenal sphincteroplasty*/
	_545001, /*Operative procedure on lower leg*/
	_549007, /*Incision of intracranial vein*/
	_550007, /*Excision of lesion of adenoids*/
	_559008, /*Excision of varicose vein*/
	_570001, /*Vaccination for arthropod-borne viral encephalitis*/
	_574005, /*Benzodiazepine measurement*/
	_603006, /*Synchondrotomy*/
	_617002, /*Bone graft of mandible*/
	_618007, /*Frontal sinusectomy*/
	_625000, /*Removal of supernumerary digit*/
	_628003, /*Steinman test*/
	_629006, /*Lysis of adhesions of urethra*/
	_633004, /*Chart review by physician*/
	_637003, /*Lysis of adhesions of nose*/
	_642006, /*Cerebral thermography*/
	_645008, /*Diagnostic procedure on vitreous*/
	_647000, /*Excision of cervix by electroconization*/
	_657004, /*Operation on bursa*/
	_665001, /*Partial meniscectomy of temporomandibular joint*/
	_670008, /*Electrosurgical epilation of eyebrow*/
	_671007, /*Transplantation of testis*/
	_673005, /*Indirect examination of larynx*/
	_674004, /*Abduction test*/
	_676002, /*Peritoneal dialysis including cannulation*/
	_680007, /*Radiation physics consultation*/
	_687005, /*Albumin/Globulin ratio*/
	_695009, /*Destructive procedure of lesion on skin of trunk*/
	_697001, /*Hepatitis A virus antibody measurement*/
	_710006, /*Thromboendarterectomy with graft of mesenteric artery*/
	_712003, /*Closed chest suction*/
	_721002, /*Medical procedure on periurethral tissue*/
	_722009, /*Fine needle biopsy of thymus*/
	_726007, /*Pathology consultation,  comprehensive,  records and specimen with report*/
	_730005, /*Incision of subcutaneous tissue*/
	_741007, /*Operation on prostate*/
	_746002, /*Chiropractic adjustment of coccyx subluxation*/
	_753006, /*Manipulation of ankle AND foot*/
	_754000, /*Total urethrectomy*/
	_759005, /*Intracerebral electroencephalogram*/
	_762008, /*Computerized axial tomography of cervical spine with contrast*/
	_764009, /*Arthrodesis of interphalangeal joint of great toe*/
	_767002, /*White blood cell count - observation*/
	_789003, /*Cranial decompression,  subtemporal,  supratentorial*/
	_791006, /*Dressing and fixation procedure*/
	_807005, /*Excision of brain*/
	_814007, /*Electrophoresis measurement*/
	_817000, /*Excision of cyst of spleen*/
	_831000, /*Drawer test*/
	_851001, /*Root canal therapy,  molar,  excluding final restoration*/
	_853003, /*Fecal fat measurement,  72-hour collection*/
	_867007, /*Hypoglossofacial anastomosis*/
	_870006, /*Carbamazepine measurement*/
	_879007, /*Special blood coagulation test,  explain by report*/
	_881009, /*Separation of ciliary body*/
	_893000, /*Tumor antigen measurement*/
	_897004, /*Radical maxillary antrotomy*/
	_910002, /*MHPG measurement,  urine*/
	_911003, /*Removal of subarachnoid-ureteral shunt*/
	_913000, /*Chiropractic patient education*/
	_926001, /*Embolectomy with catheter of radial artery by arm incision*/
	_935008, /*Excision of bulbourethral gland*/
	_941001, /*Endoscopy of pituitary gland*/
	_945005, /*Excision of tibia and fibula for graft*/
	_948007, /*Phlebectomy of intracranial varicose vein*/
	_951000, /*Ultrasonic guidance for endomyocardial biopsy*/
	_956005, /*Anesthesia for procedure on thoracic esophagus*/
	_967006, /*Drug treatment education*/
	_969009, /*Incision and exploration of larynx*/
	_971009, /*Prosthetic construction and fitting*/
	_1001000, /*Cauterization of Bartholin's gland*/
	_1008006, /*Operation on nerve ganglion*/
	_1019009, /*Removal of corneal epithelium*/
	_1021004, /*Repair of scrotum*/
	_1029002, /*Fetoscopy*/
	_1032004, /*Enucleation of parotid gland cyst*/
	_1035002, /*Minimum bactericidal concentration test,  microdilution method*/
	_1036001, /*Insertion of intravascular device in common iliac vein,  complete*/
	_1041009, /*Debridement of open fracture of phalanges of foot*/
	_1042002, /*Paternity testing*/
	_1043007, /*Doppler color flow velocity mapping*/
	_1044001, /*Diagnostic ultrasound of abdomen and retroperitoneum*/
	_1048003, /*Capillary blood sampling*/
	_1054002, /*Sphincterotomy of papilla of Vater*/
	_1071001, /*Proximal splenorenal anastomosis*/
	_1084005, /*Excision of perinephric cyst*/
	_1093006, /*Excision of abdominal varicose vein*/
	_1103000, /*Transcrural mobilization of stapes*/
	_1104006, /*Triad knee repair*/
	_1115001, /*Decortication*/
	_1119007, /*Closed reduction of dislocation of foot and toe*/
	_1121002, /*Kinetic activities for range of motion*/
	_1127003, /*Interstitial radium application*/
	_1133007, /*Removal of intact mammary implant,  bilateral*/
	_1163003, /*Ureteroenterostomy*/
	_1176009, /*Incision of inguinal region*/
	_1181000, /*Excision of tendon for graft*/
	_1186005, /*Anesthesia for procedure on bony pelvis*/
	_1198000, /*Excisional biopsy of bone of scapula*/
	_1209007, /*Arthroscopic repair lateral meniscus*/
	_1225002, /*Upper arm X-ray*/
	_1227005, /*Incision of subvalvular tissue for discrete subvalvular aortic stenosis*/
	_1235008, /*Muscle transfer*/
	_1237000, /*Application of cast,  sugar tong*/
	_1238005, /*Epiphyseal arrest by stapling of distal radius*/
	_1251000, /*Incisional biopsy of testis*/
	_1253002, /*Refusion of spine*/
	_1258006, /*Excision of meniscus of wrist*/
	_1266002, /*Closure of tympanic membrane perforation*/
	_1267006, /*Electrocoagulation of lesion of vagina*/
	_1278003, /*Open reduction of closed shoulder dislocation with fracture of greater tuberosity*/
	_1279006, /*Repair of cardiac pacemaker pocket in skin AND/OR subcutaneous tissue*/
	_1292009, /*MRI of bladder*/
	_1299000, /*Excision of appendiceal stump*/
	_1315009, /*Reconstruction of eyebrow*/
	_1316005, /*Upper partial denture,  cast metal base without resin saddles,  including any conventional clasps,  rests and teeth*/
	_1324000, /*Cerebrospinal fluid immunoglobulin G ratio and immunoglobulin G index*/
	_1327007, /*Procedure on Meckel diverticulum*/
	_1328002, /*Ilioiliac shunt*/
	_1329005, /*Division of congenital web of larynx*/
	_1337002, /*Colosigmoidostomy*/
	_1339004, /*Manual evacuation of feces*/
	_1347004, /*Medical procedure on palate*/
	_1352009, /*Anterior spinal rhizotomy*/
	_1358008, /*Anti-human globulin test,  enzyme technique,  titer*/
	_1366004, /*Breathing treatment*/
	_1385001, /*Echography,  scan B-mode for foetal age determination*/
	_1390003, /*Laparoscopic sigmoid colectomy*/
	_1398005, /*Direct thrombectomy of iliac vein by leg incision*/
	_1399002, /*Incision and exploration of ureter*/
	_1407007, /*Application of long leg cast,  brace type*/
	_1410000, /*Anesthesia for tympanotomy*/
	_1411001, /*Operation on papillary muscle of heart*/
	_1413003, /*Penetrating keratoplasty with homograft*/
	_1414009, /*Angiography of arteriovenous shunt*/
	_1417002, /*Operation on face*/
	_1431002, /*pexy*/
	_1440003, /*Repair with resection-recession*/
	_1449002, /*Removal of hair*/
	_1453000, /*Biofeedback,  galvanic skin response*/
	_1455007, /*Cerclage*/
	_1457004, /*Truncal vagotomy with pyloroplasty and gastrostomy*/
	_1494008, /*Osmolarity measurement*/
	_1500007, /*Bilateral epididymovasostomy*/
	_1501006, /*Altemeier operation,  perineal rectal pull-through*/
	_1505002, /*Hospital admission for isolation*/
	_1529009, /*Aspiration of soft tissue*/
	_1533002, /*Ureteroplication*/
	_1550000, /*Amikacin level*/
	_1555005, /*Brief group psychotherapy*/
	_1559004, /*Interleukin (IL)-2 assay*/
	_1576000, /*Repair of intestinouterine fistula*/
	_1577009, /*Implantation of cardiac single-chamber device replacement,  rate-responsive*/
	_1578004, /*Reconstruction of ossicles with stapedectomy*/
	_1583007, /*Tractotomy of mesencephalon*/
	_1585000, /*Lengthening of gastrocnemius muscle*/
	_1596008, /*Anesthesia for total elbow replacement*/
	_1597004, /*Skeletal X-ray of ankle and foot*/
	_1602006, /*Social service interview with planning*/
	_1614003, /*Bilateral repair of inguinal hernia,  direct*/
	_1615002, /*Reline upper partial denture,  chairside*/
	_1616001, /*Galactosylceramide beta-galactosidase measurement,  leukocytes*/
	_1636000, /*Injection of sclerosing agent in varicose vein*/
	_1638004, /*Cineplasty with cineplastic prosthesis of extremity*/
	_1640009, /*History and physical examination,  insurance*/
	_1645004, /*Transduodenal sphincterotomy*/
	_1651009, /*Excision of tendon sheath*/
	_1653007, /*Internal fixation of bone without fracture reduction*/
	_1669000, /*Making occupied bed*/
	_1677001, /*Haagensen test*/
	_1678006, /*Endoscopic procedure of nerve*/
	_1680000, /*Secondary chemoprophylaxis*/
	_1683003, /*Direct closure of laceration of conjunctiva*/
	_1689004, /*Local excision of ovary*/
	_1691007, /*Drainage of abscess of tonsil*/
	_1699009, /*Special dosimetry*/
	_1702002, /*Labial veneer,  resin laminate,  laboratory*/
	_1704001, /*Correction of tibial pseudoarthrosis*/
	_1709006, /*Breast reconstruction,  bilateral,  with bilateral pedicle transverse rectus abdominis myocutaneous flaps*/
	_1712009, /*Immunoglobulin typing,  immunoglobulin G*/
	_1713004, /*Hypothermia,  total body,  induction and maintenance*/
	_1730002, /*Suture of skin wound of hindfoot*/
	_1746005, /*Buckling of sclera using implant*/
	_1747001, /*Replacement of skeletal muscle stimulator*/
	_1753001, /*Resection of uveal tissue*/
	_1757000, /*Arthroscopy of wrist with partial synovectomy*/
	_1759002, /*Assessment of nutritional status*/
	_1770009, /*Mitral valvotomy*/
	_1774000, /*Nasopharyngeal rehabilitation*/
	_1775004, /*Submaxillary incision with drainage*/
	_1784004, /*Fecal stercobilin,  qualitative*/
	_1787006, /*Ultrasonic guidance for pericardiocentesis*/
	_1788001, /*Blood unit collection for directed donation,  donor*/
	_1801001, /*Endoscopic biopsy of duodenum*/
	_1805005, /*Take-down of stoma*/
	_1811008, /*Aspiration of bursa of hand*/
	_1813006, /*Cryotherapy of genital warts*/
	_1820004, /*Ethanol measurement,  breath*/
	_1830008, /*Open reduction of open sacral fracture*/
	_1836002, /*Excision of diverticulum of ventricle of heart*/
	_1844002, /*Plication of ligament*/
	_1854003, /*Incision of nose*/
	_1859008, /*Hand tendon foreign body removed*/
	_1861004, /*Anesthesia for closed procedure on humerus and elbow*/
	_1862006, /*Thoracic phlebectomy*/
	_1866009, /*Bilateral total nephrectomy*/
	_1868005, /*FB - Removal of foreign body from brain*/
	_1870001, /*Insertion of halo device of skull with synchronous skeletal traction*/
	_1871002, /*Repair of aneurysm of coronary artery*/
	_1872009, /*Suture of male perineum*/
	_1876007, /*Recession of prognathic jaw*/
	_1879000, /*Fluorescent antigen measurement*/
	_1889001, /*Patient transfer,  in-hospital,  unit-to-unit*/
	_1906007, /*Insertion of prosthesis or prosthetic device of arm,  bioelectric or cineplastic*/
	_1907003, /*Bifurcation of bone*/
	_1917008, /*Patient discharge,  deceased,  medicolegal case*/
	_1924009, /*Hepaticotomy with drainage*/
	_1950008, /*Drainage of nasal septal abscess*/
	_1958001, /*Grafting of bone of thumb with transfer of skin flap*/
	_1966005, /*Central block anesthesia*/
	_1983001, /*Total urethrectomy including cystostomy in female*/
	_1995001, /*Stripping of cerebral meninges*/
	_1999007, /*Psychologic test*/
	_2002009, /*Construction of subcutaneous tunnel without esophageal anastomosis*/
	_2021001, /*Internal fixation of radius and ulna without fracture reduction*/
	_2051007, /*Red cell iron utilization study*/
	_2054004, /*Barbiturates measurement,  quantitative and qualitative*/
	_2067001, /*Implantation of electromagnetic hearing aid*/
	_2069003, /*Dental subperiosteal implant*/
	_2078009, /*Puncture of bursa of hand*/
	_2079001, /*Reimplantation of anomalous pulmonary artery*/
	_2080003, /*Angiectomy with anastomosis of lower limb artery*/
	_2098004, /*Open reduction of open mandibular fracture with external fixation*/
	_2115003, /*Dental prophylaxis,  children*/
	_2119009, /*Repair of blood vessel*/
	_2127000, /*Reduction of closed sacral fracture*/
	_2137005, /*Excision of pericardial tumor*/
	_2153008, /*Cardiac catheterization education*/
	_2161003, /*Operation on vulva*/
	_2164006, /*Injection of aorta*/
	_2166008, /*Bicuspidization of aortic valve*/
	_2171001, /*Excision of tonsil tags*/
	_2178007, /*Ureterocentesis*/
	_2181002, /*Operation for bone injury of tarsals and metatarsals*/
	_2188008, /*Suture of tendon to skeletal attachment*/
	_2193006, /*Repair of ruptured aneurysm with graft of celiac artery*/
	_2196003, /*Gas liquid chromatography,  electron capture type*/
	_2199005, /*Excision of lesion of cul-de-sac*/
	_2214008, /*Curette test of skin*/
	_2220009, /*Complement component assay*/
	_2225004, /*Sensititer system test*/
	_2234009, /*Proctosigmoidopexy*/
	_2238007, /*Stone operation,  anoplasty*/
	_2242005, /*Reconstruction of eyelid*/
	_2244006, /*Arthroscopy of wrist with internal fixation for instability*/
	_2250001, /*Resection of ascending aorta with anastomosis*/
	_2252009, /*Hospital admission,  urgent,  48 hours*/
	_2266004, /*Venography of adrenal,  bilateral*/
	_2267008, /*Replacement of tracheostomy tube*/
	_2270007, /*Correction of cleft hand*/
	_2276001, /*Exploration of popliteal artery*/
	_2278000, /*Urinalysis,  automated*/
	_2279008, /*Antibody detection,  red blood cell,  enzyme,  1 stage technique,  including anti-human globulin*/
	_2290003, /*Microbial culture,  anaerobic,  initial isolation*/
	_2315006, /*Brain meninges operation*/
	_2318008, /*Anesthesia for cast procedure on forearm,  wrist or hand*/
	_2321005, /*Delivery by Ritgen maneuver*/
	_2322003, /*Suture of recent wound of eyelid,  direct closure,  full-thickness*/
	_2337004, /*Adductor tenotomy*/
	_2344008, /*Complicated cystorrhaphy*/
	_2347001, /*Diagnostic model construction*/
	_2364003, /*Radical resection of tumor of soft tissue of wrist area*/
	_2371008, /*Tympanoplasty type II with graft against incus or malleus*/
	_2373006, /*Buffy coat smear evaluation*/
	_2382000, /*Application of breast pump*/
	_2386002, /*Closed reduction of dislocation of patella*/
	_2393003, /*Ligation of vein of lower limb*/
	_2406000, /*Chart periodontal pocket*/
	_2407009, /*Excision of mediastinal tumor*/
	_2408004, /*Hexosaminidase A and total hexosaminidase measurement,  serum*/
	_2409007, /*Replantation of toe*/
	_2425002, /*Epstein-Barr virus serologic test*/
	_2442008, /*Incision of lacrimal canaliculus*/
	_2448007, /*Cell count of synovial fluid with differential count*/
	_2455009, /*Revision of lumbosubarachnoid shunt*/
	_2457001, /*Blind rehabilitation*/
	_2458006, /*Educational therapy*/
	_2459003, /*Destructive procedure of artery of upper extremity*/
	_2461007, /*Tennis elbow test*/
	_2474001, /*Repair of malunion of metatarsal bones*/
	_2475000, /*Twenty-four hour collection of urine*/
	_2480009, /*Debridement of skin,  subcutaneous tissue,  muscle and bone*/
	_2486003, /*Destructive procedure of breast*/
	_2488002, /*Provision of contact lens*/
	_2494005, /*Nurse to nurse communication*/
	_2498008, /*Rebase of upper partial denture*/
	_2507007, /*5' Nucleotidase measurement*/
	_2508002, /*Retrograde urography with kidney-ureter-bladder*/
	_2514009, /*Manual reduction of closed supracondylar fracture of humerus with traction*/
	_2517002, /*Stroke rehabilitation*/
	_2530001, /*Chiropractic visit*/
	_2531002, /*Mononuclear cell function assay*/
	_2535006, /*Removal of pulp - complete*/
	_2536007, /*Injection of medication in anterior chamber of eye*/
	_2547000, /*Excision of keloid*/
	_2552005, /*Incision of cerebral subarachnoid space*/
	_2564002, /*Creation of lumbar shunt including laminectomy*/
	_2566000, /*Osteoplasty of radius*/
	_2567009, /*Resection of rib by transaxillary approach*/
	_2580007, /*Transplant of hair follicles to scalp*/
	_2598006, /*Open heart surgery*/
	_2601001, /*Removal of bone flap of skull*/
	_2607002, /*Operation of supporting structures of uterus*/
	_2613006, /*Implantation of joint prosthesis of hand*/
	_2614000, /*Removal of ligature from fallopian tube*/
	_2616003, /*Repair of bifid digit of hand*/
	_2619005, /*Psychiatric interpretation to family or parents of patient*/
	_2629003, /*Intracranial/cerebral perfusion pressure monitoring*/
	_2632000, /*Incision and drainage of infected bursa of upper arm*/
	_2642003, /*Prefabricated post and core in addition to crown*/
	_2643008, /*Ligation of varicose vein of head and neck*/
	_2644002, /*Cauterization of liver*/
	_2645001, /*Intelligence test/WB1*/
	_2646000, /*Incision and exploration of vas deferens*/
	_2658000, /*Social service interview of patient*/
	_2659008, /*Suture of ligament of lower extremity*/
	_2668005, /*Recementation of space maintainer*/
	_2670001, /*Diagnostic procedure on cornea*/
	_2673004, /*Incision and drainage of masticator space by extraoral approach*/
	_2677003, /*Stripping*/
	_2690005, /*MRI of pelvis*/
	_2693007, /*Stool fat,  quantitative measurement*/
	_2696004, /*Hepatic venography with hemodynamic evaluation*/
	_2697008, /*Stripping and ligation of great saphenous vein*/
	_2716009, /*Dermal-fat-fascia graft*/
	_2722000, /*Interleukin-3 assay*/
	_2731000, /*Serologic test for influenza virus A*/
	_2732007, /*Recession of tendon of hand*/
	_2737001, /*Exploratory craniotomy,  infratentorial*/
	_2742009, /*Destruction of Bartholin's gland*/
	_2743004, /*Operative endoscopy of ileum*/
	_2745006, /*Epiplopexy*/
	_2752008, /*Incudopexy*/
	_2780005, /*Osteoplasty of facial bones*/
	_2794006, /*Cauterization of navel*/
	_2802005, /*Manual dilation and stretching*/
	_2811005, /*Cineradiography of pharynx*/
	_2813008, /*Nephroureterocystectomy*/
	_2837008, /*Transposition of ulnar nerve at elbow*/
	_2842000, /*Gas chromatography measurement*/
	_2843005, /*Revision of urinary conduit*/
	_2847006, /*Cervical myelography*/
	_2851008, /*Arthrotomy for synovectomy of sternoclavicular joint*/
	_2854000, /*Bursectomy of hand*/
	_2857007, /*Pinealectomy*/
	_2866006, /*Obliteration of lymphatic structure*/
	_2875008, /*Implantation of joint prosthesis of elbow*/
	_2876009, /*Hospital admission,  type unclassified,  explain by report*/
	_2885009, /*Intradermal allergen test*/
	_2891006, /*Arthroscopy of elbow with partial synovectomy*/
	_2898000, /*Deoxyribonucleic acid analysis,  antenatal,  blood*/
	_2903001, /*Diagnostic procedure on anterior chamber of eye*/
	_2908005, /*Cryotherapy to hemorrhoid*/
	_2914003, /*Anterior sclerotomy*/
	_2915002, /*Suture of capsule of ankle*/
	_2933008, /*Pneumogynecography*/
	_2945004, /*Suprapubic diverticulectomy of urinary bladder*/
	_2947007, /*Therapeutic compound measurement*/
	_2960001, /*Closure of fistula of uterine cervix*/
	_2968008, /*Craniectomy with treatment of penetrating wound of brain*/
	_2970004, /*Metacarpal lengthening and transfer of local flap*/
	_2971000, /*Closure of acquired urethrovaginal fistula*/
	_2977001, /*Thrombectomy of lower limb vein*/
	_3001009, /*Total lobectomy with bronchoplasty*/
	_3010001, /*Removal of silastic tubes from ear*/
	_3016007, /*Removal of Crutchfield tongs from skull*/
	_3025001, /*Calcitonin measurement*/
	_3026000, /*Tibiotalar arthrodesis*/
	_3029007, /*Peripheral nervous system disease rehabilitation*/
	_3041000, /*Repair of stomach*/
	_3047001, /*Kowa fundus photography*/
	_3060007, /*Forequarter amputation,  right*/
	_3061006, /*Complete excision of nail AND nail matrix*/
	_3063009, /*Gastroscopy through artificial stoma*/
	_3075004, /*Nonoperative removal of prosthesis of bile duct*/
	_3078002, /*Embolectomy with catheter of renal artery by abdominal incision*/
	_3083005, /*Removal of device from thorax*/
	_3088001, /*Anesthesia for endoscopic procedure on upper extremity*/
	_3090000, /*Aneurysmectomy with graft replacement of lower limb artery*/
	_3112006, /*Restraint removal*/
	_3116009, /*Clotting screening*/
	_3130004, /*Monitoring of cardiac output by electrocardiogram*/
	_3133002, /*Patient discharge,  deceased,  autopsy*/
	_3137001, /*Replacement*/
	_3143004, /*Visual field examination and evaluation,  intermediate*/
	_3162001, /*Gadolinium measurement*/
	_3164000, /*Open reduction of closed mandibular fracture with interdental fixation*/
	_3165004, /*Irrigation of muscle of hand*/
	_3166003, /*Closure of fistula of salivary gland*/
	_3177009, /*Internal obstetrical version*/
	_3183007, /*Closure of colostomy*/
	_3186004, /*Excision of Skene gland*/
	_3190002, /*Epilation by forceps*/
	_3204007, /*Destructive procedure of nerve*/
	_3241008, /*Correction of chordee with mobilization of urethra*/
	_3249005, /*Surgical construction of filtration bleb*/
	_3251009, /*Mayo operation,  herniorrhaphy*/
	_3256004, /*Cervical lymphangiogram*/
	_3257008, /*Empty and measure peritoneal dialysis fluid*/
	_3258003, /*Cerebral arteriography*/
	_3268008, /*Transplantation of tissue of pelvic region*/
	_3270004, /*Implantation of neurostimulator in spine*/
	_3278006, /*Lysis of adhesions of bursa of hand*/
	_3287002, /*Cholecystogastrostomy*/
	_3320000, /*Abt - autologous blood transfusion*/
	_3324009, /*Laser beam photocoagulation*/
	_3326006, /*Excision of exostosis of head of fifth metatarsal*/
	_3328007, /*Incision of vein of head and neck*/
	_3333006, /*Application of short arm splint,  forearm to hand,  static*/
	_3338002, /*Open reduction of open radial shaft fracture*/
	_3352000, /*PTH - Parathyroid hormone level*/
	_3357006, /*Iron kinetics*/
	_3360004, /*Biliary anastomosis*/
	_3390006, /*Verification procedure*/
	_3399007, /*Reduction of torsion of omentum*/
	_3407002, /*Creation of lesion of spinal cord by percutaneous method*/
	_3413006, /*Blood cell morphology*/
	_3418002, /*Chondrectomy of spine*/
	_3432000, /*Preventive dental service*/
	_3443008, /*Pulp capping*/
	_3448004, /*Fixation of contralateral testis*/
	_3450007, /*Lymphocytes,  T & B cell evaluation*/
	_3457005, /*Referral procedure*/
	_3479000, /*Removal of heart assist system with replacement*/
	_3498003, /*Total excision of pituitary gland by transsphenoidal approach*/
	_3499006, /*Aspiration of vitreous with replacement*/
	_3509001, /*Streptococcus vaccination*/
	_3512003, /*Angiography of arteries of extremity*/
	_3515001, /*Replacement of electronic heart device,  pulse generator*/
	_3517009, /*Removal of foreign body of pelvis from subcutaneous tissue*/
	_3518004, /*Aversive psychotherapy*/
	_3527003, /*Antibody measurement*/
	_3546002, /*CVG - Coronary vein graft*/
	_3559005, /*Insertion of ureteral stent with ureterotomy*/
	_3562008, /*Rodney Smith operation,  radical subtotal pancreatectomy*/
	_3564009, /*Removal of foreign body from fallopian tube*/
	_3575008, /*Repair of fascia with graft of fascia*/
	_3580004, /*Removal of calculus of pharynx*/
	_3605001, /*Reduction of ciliary body*/
	_3607009, /*Transplantation of mesenteric tissue*/
	_3620007, /*Red cell survival study with hepatic sequestration*/
	_3625002, /*Anesthesia for brachial arteriograms,  retrograde*/
	_3651000, /*Morphometric analysis,  nerve*/
	_3654008, /*Excision of lingula*/
	_3659003, /*Incision of inner ear*/
	_3664004, /*Closure of scleral fistula*/
	_3666002, /*Repair of peripheral nerve by suturing*/
	_3669009, /*Fitting of prosthesis or prosthetic device of upper arm*/
	_3673007, /*Leadbetter urethral reconstruction*/
	_3683006, /*Selenium measurement,  urine*/
	_3686003, /*Zancolli operation for tendon transfer of biceps*/
	_3688002, /*Anesthesia for lens surgery*/
	_3690001, /*Shunt of left subclavian to descending aorta by Blalock-Park operation*/
	_3691002, /*Wedge osteotomy of tarsals and metatarsals*/
	_3697003, /*Tissue processing technique,  routine,  embed,  cut and stain,  per autopsy*/
	_3700004, /*Erysophake extraction of lens*/
	_3701000, /*Removal of foreign body of hip from subcutaneous tissue*/
	_3713005, /*Release for de Quervain tenosynovitis of hand*/
	_3717006, /*Dilute Russell viper venom time*/
	_3734003, /*SSG - Split skin graft*/
	_3735002, /*Coproporphyrin III measurement*/
	_3740005, /*Removal of foreign body of canthus by incision*/
	_3748003, /*Biopsy of perirenal tissue*/
	_3749006, /*Reduction of closed ischial fracture*/
	_3758004, /*Thrombectomy with catheter of subclavian artery by neck incision*/
	_3770000, /*Ward urine dip stick testing*/
	_3778007, /*Scrotum manipulation*/
	_3780001, /*Routine patient disposition,  no follow-up planned*/
	_3784005, /*Delayed hypersensitivity skin test for streptokinase-streptodornase*/
	_3786007, /*Excision of lesion of pharynx*/
	_3787003, /*Ultrasonic guidance for needle biopsy*/
	_3794000, /*Pregnanetriol measurement*/
	_3796003, /*Excision of redundant mucosa from jejunostomy*/
	_3799005, /*Radiography of adenoids*/
	_3802001, /*Topical application of tooth medicament - desensitizing agent*/
	_3819004, /*Embolization of thoracic artery*/
	_3826004, /*Blepharotomy with drainage of abscess of eyelid*/
	_3828003, /*Open biopsy of vertebral body of thoracic region*/
	_3831002, /*Chiropractic application of ice*/
	_3843001, /*Removal of foreign body from fascia*/
	_3858009, /*Echography of thyroid,  A-mode*/
	_3861005, /*Aneurysmectomy with anastomosis of lower limb artery*/
	_3862003, /*Total vital capacity measurement*/
	_3864002, /*Excisional biopsy of scrotum*/
	_3880007, /*Excision of lesion of fibula*/
	_3881006, /*Incision and drainage of submental space by extraoral approach*/
	_3887005, /*Wart ligation*/
	_3889008, /*Suture of lip*/
	_3891000, /*Comprehensive orthodontic treatment,  permanent dentition,  for class I malocclusion*/
	_3895009, /*Dressing*/
	_3907006, /*Incision and drainage of retroperitoneal abscess*/
	_3911000, /*Transplantation of muscle*/
	_3915009, /*Excision of artery of thorax and abdomen*/
	_3917001, /*Excisional biopsy of phalanges of foot*/
	_3918006, /*Plastic repair with lengthening*/
	_3926003, /*Lactate measurement*/
	_3929005, /*Patient transfer,  in-hospital,  bed-to-bed*/
	_3936006, /*Making Foster bed*/
	_3938007, /*Cerclage for retinal reattachment*/
	_3942005, /*Cystopexy*/
	_3955006, /*Antibody elution from red blood cells*/
	_3957003, /*Arteriectomy of thoracoabdominal aorta*/
	_3963007, /*Operation on submaxillary gland*/
	_3967008, /*Fluorescence polarization immunoassay*/
	_3968003, /*Excision of spinal facet joint*/
	_3969006, /*Removal of osteocartilagenous loose body from joint structures*/
	_3971006, /*Duchenne muscular dystrophy carrier detection*/
	_3980006, /*Partial excision of esophagus*/
	_3981005, /*Carrier detection,  molecular genetics*/
	_3985001, /*Anesthesia for procedure on arteries of lower leg with bypass graft*/
	_3991004, /*MRI of pelvis,  prostate and bladder*/
	_3998005, /*Bone imaging of limited area*/
	_4007002, /*Anti-human globulin test,  indirect,  titer,  non-gamma*/
	_4008007, /*Phlebography of neck*/
	_4010009, /*Oophorectomy of remaining ovary with tube*/
	_4027001, /*Implantation of electronic stimulator into phrenic nerve*/
	_4034004, /*Closed reduction of facial fracture,  except mandible*/
	_4035003, /*Restoration,  resin,  two surfaces,  posterior,  permanent*/
	_4036002, /*Arthroscopy of elbow with extensive debridement*/
	_4037006, /*Removal of vascular graft or prosthesis*/
	_4044002, /*Construction of permanent colostomy*/
	_4045001, /*Drainage of cerebral ventricle by incision*/
	_4052004, /*Percutaneous aspiration of spinal cord cyst*/
	_4064007, /*Specimen aliquoting*/
	_4068005, /*Removal of ventricular reservoir with synchronous replacement*/
	_4083000, /*Fitting of prosthesis or prosthetic device of lower arm*/
	_4084006, /*Repair of tendon of hand by graft or implant of muscle*/
	_4090005, /*Replacement of transvenous atrial and ventricular pacemaker electrode leads*/
	_4094001, /*Reduction of retroversion of uterus by suppository*/
	_4101004, /*Revision of spinal pleurothecal shunt*/
	_4102006, /*Root canal therapy,  anterior,  excluding final restoration*/
	_4114003, /*Parenteral chemotherapy for malignant neoplasm*/
	_4116001, /*Construction of window*/
	_4119008, /*Intracranial phlebectomy with anastomosis*/
	_4131005, /*Implantation into pelvic region*/
	_4134002, /*Operative block anesthesia*/
	_4139007, /*Posterior spinal cordotomy*/
	_4143006, /*Injection into anterior chamber of eye*/
	_4149005, /*Bone histomorphometry,  aluminum stain*/
	_4154001, /*Incision and drainage of penis*/
	_4165006, /*Delayed hypersensitivity skin test for staphage lysate*/
	_4176005, /*Fothergill repair*/
	_4192000, /*Toxicology testing for organophosphate insecticide*/
	_4213001, /*Implantation of Ommaya reservoir*/
	_4214007, /*Intracardiac injection for cardiac resuscitation*/
	_4226002, /*Excision of lesion of thoracic vein*/
	_4252008, /*Aneurysmectomy with graft replacement by interposition*/
	_4263006, /*Biopsy of soft tissue of elbow area,  superficial*/
	_4266003, /*Patient referral for drug addiction rehabilitation*/
	_4285000, /*Insertion of bone growth stimulator into femur*/
	_4293000, /*Reduction of intussusception by laparotomy*/
	_4304000, /*Excision of cusp of tricuspid valve*/
	_4319004, /*Rebase of complete lower denture*/
	_4321009, /*Bilateral leg arteriogram*/
	_4323007, /*Destruction of lesion of sclera*/
	_4331002, /*Anesthesia for hernia repair in lower abdomen*/
	_4333004, /*Incision and drainage of perisplenic space*/
	_4336007, /*Lloyd-Davies operation,  abdominoperineal resection*/
	_4337003, /*Homogentisic acid measurement*/
	_4339000, /*Repair of nasolabial fistula*/
	_4341004, /*Complete submucous resection of turbinate*/
	_4344007, /*Cryopexy*/
	_4348005, /*Musculoplasty of hand*/
	_4350002, /*Removal of implant of cornea*/
	_4363008, /*Endoscopic brush biopsy of trachea*/
	_4365001, /*Surgical repair*/
	_4380007, /*Transposition of vulvar tissue*/
	_4387005, /*Valvuloplasty of pulmonary valve in total repair of tetralogy of Fallot*/
	_4388000, /*Repair of splenocolic fistula*/
	_4407008, /*Slitting of lacrimal canaliculus for passage of tube*/
	_4411002, /*Removal of device from female genital tract*/
	_4420006, /*Incision and drainage of parapharyngeal abscess by external approach*/
	_4424002, /*Making orthopedic bed*/
	_4436008, /*Methylatable chemotaxis protein (MCP) receptor measurement*/
	_4438009, /*Venography of vena cava*/
	_4443002, /*Decortication of ovary*/
	_4447001, /*Autopsy,  gross and microscopic examination,  stillborn or newborn without central nervous system*/
	_4449003, /*Manipulation of spinal meninges*/
	_4450003, /*Application of Kirschner wire*/
	_4455008, /*Open reduction of open elbow dislocation*/
	_4457000, /*Insertion of mold into vagina*/
	_4466001, /*Exploration of upper limb artery*/
	_4467005, /*Excision of tumor of ankle area,  deep,  intramuscular*/
	_4475004, /*Cyanide level*/
	_4487006, /*Norepinephrine measurement,  supine*/
	_4489009, /*Neurolysis of trigeminal nerve*/
	_4496006, /*Mouthcare procedure*/
	_4503005, /*Removal of foreign body of sclera without use of magnet*/
	_4504004, /*Potter obstetrical version with extraction*/
	_4505003, /*Tenolysis of flexor tendon of forearm*/
	_4507006, /*Decompression fasciotomy of wrist,  flexor and extensor compartment*/
	_4511000, /*Restoration,  inlay,  composite/resin,  one surface,  laboratory processed*/
	_4516005, /*Iridencleisis and iridotasis*/
	_4520009, /*Anastomosis of esophagus,  antesternal or antethoracic,  with insertion of prosthesis*/
	_4525004, /*Seen by casualty - service*/
	_4533003, /*Ligation of artery of lower limb*/
	_4535005, /*Incision of pelvirectal tissue*/
	_4539004, /*Excision of cyst of bronchus*/
	_4542005, /*Closed reduction of fracture of foot*/
	_4544006, /*Excision of subcutaneous tumor of extremities*/
	_4558008, /*Anterior resection of rectum*/
	_4563007, /*Hospital admission,  transfer from other hospital or health care facility*/
	_4570007, /*Chemopallidectomy*/
	_4579008, /*Creation of ventriculoatrial shunt*/
	_4581005, /*Coreoplasty*/
	_4585001, /*Decompression of tendon of hand*/
	_4587009, /*Epiphysiodesis of distal radius*/
	_4589007, /*Care relating to reproduction and pregnancy*/
	_4593001, /*Cauterization of sclera with iridectomy*/
	_4594007, /*Coproporphyrin isomers,  series I & III,  urine*/
	_4613005, /*Radioimmunoassay*/
	_4625008, /*Apical pulse taking*/
	_4626009, /*Take-down of arterial anastomosis*/
	_4636001, /*Denker operation for radical maxillary antrotomy*/
	_4640005, /*Ligation of fallopian tubes by abdominal approach*/
	_4642002, /*Removal of inflatable penile prosthesis,  with pump,  reservoir and cylinders*/
	_4660002, /*Diagnostic procedure on phalanges of foot*/
	_4670000, /*Catheterization of bronchus*/
	_4671001, /*Excision of lesion from sphenoid sinus*/
	_4672008, /*Medical procedure on the nervous system*/
	_4691008, /*Identification of rotavirus antigen in feces*/
	_4692001, /*Transplantation of artery of upper extremity*/
	_4694000, /*Percutaneous biopsy of muscle*/
	_4699005, /*Alpha naphthyl butyrate stain method,  blood or bone marrow*/
	_4701005, /*Colony forming unit-granulocyte-monocyte-erythroid-megakaryocyte assay*/
	_4707009, /*Partial excision of calcaneus*/
	_4712005, /*Removal of Gardner Wells tongs from skull*/
	_4713000, /*Endoscopy and photography*/
	_4719001, /*Psychologic cognitive testing and assessment*/
	_4727005, /*Lipoprotein electrophoresis*/
	_4734007, /*Irrigation of wound catheter of integument*/
	_4737000, /*Mycobacteria culture*/
	_4756005, /*Cryotherapy of subcutaneous tissue*/
	_4758006, /*Incudostapediopexy*/
	_4764004, /*Jet ventilation procedure*/
	_4765003, /*Insertion of ocular implant following or secondary to enucleation*/
	_4770005, /*Colporrhaphy for repair of urethrocele*/
	_4772002, /*Reduction of torsion of spermatic cord*/
	_4784000, /*Operation on sublingual gland*/
	_4804005, /*Microbial identification test*/
	_4811009, /*Reconstruction of diaphragm*/
	_4815000, /*Antibody identification,  red blood cell antibody panel,  enzyme,  2 stage technique including anti-human globulin*/
	_4820000, /*Incision of labial frenum*/
	_4827002, /*Shower hydrotherapy*/
	_4829004, /*Excision of small intestine for interposition*/
	_4847005, /*Anesthesia for cesarean section*/
	_4849008, /*Ovarian biopsy*/
	_4862007, /*Revision of anastomosis of large intestine*/
	_4877004, /*Extracapsular extraction of lens with iridectomy*/
	_4891005, /*Proctostomy*/
	_4895001, /*Construction of sigmoid bladder*/
	_4902005, /*Ethchlorvynol measurement*/
	_4903000, /*Serum protein electrophoresis*/
	_4904006, /*Dilation of anal sphincter under nonlocal anesthesia*/
	_4914002, /*Treatment planning for teletherapy*/
	_4929000, /*Local perfusion of kidney*/
	_4930005, /*Repair of thoracogastric fistula*/
	_4934001, /*Salpingography*/
	_4957007, /*Cervical spinal fusion for pseudoarthrosis*/
	_4966006, /*Extracorporeal perfusion*/
	_4970003, /*Venography*/
	_4974007, /*Liver operation*/
	_4976009, /*Anesthesia for endoscopic procedure on lower extremity*/
	_4987001, /*Osteoplasty of cranium with flap of bone*/
	_4992004, /*Cardiac catheterization,  left heart,  retrograde,  percutaneous*/
	_4993009, /*Ischemic limb exercise with electromyography and lactic acid determination*/
	_5016005, /*Pontic,  resin with high noble metal*/
	_5019003, /*Direct laryngoscopy with biopsy*/
	_5021008, /*Aldosterone measurement,  standing,  normal salt diet*/
	_5022001, /*Lysergic acid diethylamide measurement*/
	_5025004, /*Semen analysis,  presence and motility of sperm*/
	_5032008, /*Labial veneer,  porcelain laminate,  laboratory*/
	_5034009, /*Graft to hair-bearing skin*/
	_5048009, /*External cephalic version with tocolysis*/
	_5055006, /*Uniscept system test*/
	_5057003, /*Radical orbitomaxillectomy*/
	_5065000, /*Reduction of closed traumatic hip dislocation with anesthesia*/
	_5091004, /*Peripheral vascular disease study*/
	_5105000, /*Endoscopy of renal pelvis*/
	_5110001, /*Ultrasound peripheral imaging,  real time scan*/
	_5113004, /*FT4 - Free thyroxine level*/
	_5119000, /*Epiglottidectomy*/
	_5121005, /*Wedge osteotomy of pelvic bone*/
	_5123008, /*Anesthesia for procedure on pericardium with pump oxygenator*/
	_5130002, /*Needling of lens for cataract*/
	_5131003, /*Radiography of chest wall*/
	_5135007, /*Diagnostic procedure on scapula*/
	_5147001, /*Excision of lesion of ankle joint*/
	_5151004, /*Manual reduction of rectal hemorrhoids*/
	_5154007, /*Communication enhancement: speech deficit*/
	_5161006, /*Specialty clinic admission*/
	_5162004, /*Excision of pressure ulcer*/
	_5165002, /*Division of thoracic artery*/
	_5176003, /*Thromboendarterectomy with graft of renal artery*/
	_5182000, /*Total body perfusion*/
	_5184004, /*Osteotomy of shaft of femur with fixation*/
	_5186002, /*Arthrotomy for synovectomy of glenohumeral joint*/
	_5190000, /*Cell fusion*/
	_5191001, /*Surgical treatment of missed miscarriage of second trimester*/
	_5212002, /*Excision of lesion of lacrimal gland by frontal approach*/
	_5216004, /*Three dimensional ultrasound imaging of heart*/
	_5233006, /*Lateral fasciotomy*/
	_5243009, /*Suture of adenoid fossa*/
	_5245002, /*Transplantation of peripheral vein*/
	_5246001, /*Breakpoint cluster region analysis*/
	_5264008, /*Total bile acids measurement*/
	_5267001, /*Adrenal artery ligation*/
	_5270002, /*Bilateral destruction of fallopian tubes*/
	_5273000, /*Manual reduction of closed fracture of proximal end of ulna*/
	_5282006, /*Operation on oropharynx*/
	_5290006, /*Incision and drainage of Ludwig angina*/
	_5298004, /*Incision and drainage of deep hematoma of thigh region*/
	_5304008, /*DXT - Radiotherapy*/
	_5316002, /*Closed osteotomy of mandibular ramus*/
	_5317006, /*Radical amputation of penis with bilateral pelvic lymphadenectomy*/
	_5326009, /*Administration of dermatologic formulation*/
	_5328005, /*Shortening of Achilles tendon*/
	_5337005, /*Trocar biopsy*/
	_5338000, /*Nicotine measurement*/
	_5342002, /*Prophylactic treatment of tibia with methyl methacrylate*/
	_5348003, /*Repair of endocardial cushion defect*/
	_5357009, /*Leukocyte poor blood preparation*/
	_5373003, /*Stress breaker*/
	_5384005, /*Excision of part of frontal cortex*/
	_5391008, /*Artificial voice rehabilitation*/
	_5393006, /*Exploration of parathyroid with mediastinal exploration by sternal split approach*/
	_5402006, /*Manipulation of thoracic artery*/
	_5407000, /*Injection of fallopian tube*/
	_5415002, /*Destruction of lesion of liver*/
	_5419008, /*Lysis of adhesions of tendon of hand*/
	_5422005, /*Amylase measurement,  peritoneal fluid*/
	_5429001, /*Diagnostic procedure on nipple*/
	_5431005, /*Percutaneous transluminal angioplasty*/
	_5433008, /*Skeletal X-ray of lower limb*/
	_5446003, /*Excision of cervical rib for outlet compression syndrome with sympathectomy*/
	_5447007, /*Transfusion*/
	_5452002, /*Core needle biopsy of thymus*/
	_5456004, /*Graft of lymphatic structure*/
	_5457008, /*Serologic test for Rickettsia conorii*/
	_5460001, /*Removal of prosthesis from fallopian tube*/
	_5479003, /*Select picture audiometry*/
	_5482008, /*Serologic test for Blastomyces*/
	_5486006, /*Delayed suture of tendon of hand*/
	_5489004, /*Diagnostic procedure on radius*/
	_5506006, /*Incision and exploration of abdominal wall*/
	_5517007, /*Restoration,  inlay,  porcelain/ceramic,  per tooth,  in addition to inlay*/
	_5521000, /*Open reduction of fracture of phalanges of foot*/
	_5536002, /*Arthrodesis of carpometacarpal joint of digits,  other than thumb*/
	_5545001, /*Repair of carotid body*/
	_5551006, /*Direct laryngoscopy with arytenoidectomy with operating microscope*/
	_5556001, /*Manually assisted spontaneous delivery*/
	_5570001, /*Arthrotomy for infection with exploration and drainage of carpometacarpal joint*/
	_5571002, /*Excision of lesion of aorta with end-to-end anastomosis*/
	_5572009, /*Incision of kidney pelvis*/
	_5586008, /*Aminolevulinic acid dehydratase measurement*/
	_5608002, /*Excretion measurement*/
	_5616006, /*Osteoplasty of tibia*/
	_5621009, /*Excision of malignant lesion of skin of extremities*/
	_5632009, /*Open biopsy of bronchus*/
	_5636007, /*Fistulectomy of bone*/
	_5638008, /*Carbohydrate measurement*/
	_5648005, /*Surgical repair and revision of shunt*/
	_5651003, /*Arylsulfatase A measurement*/
	_5663008, /*Phlebectomy of varicose vein of head and neck*/
	_5669007, /*Portable electroencephalogram awake and asleep with stimulation*/
	_5671007, /*Magnet extraction of foreign body from ciliary body*/
	_5687005, /*Removal of foreign body from ovary*/
	_5690004, /*Incision of seminal vesicle*/
	_5694008, /*Crisis intervention with follow-up*/
	_5721002, /*Repair of eyebrow*/
	_5722009, /*Surgical reanastomosis of colon*/
	_5726007, /*Removal of epicardial electrodes*/
	_5728008, /*Anoscopy for removal of foreign body*/
	_5731009, /*Hemosiderin,  quantitative measurement*/
	_5733007, /*Fluorescent identification of anti-nuclear antibody*/
	_5738003, /*Biopsy of cul-de-sac*/
	_5745003, /*Excision ampulla of Vater with reimplantation of common duct*/
	_5760000, /*Osteoplasty of radius and ulna,  shortening*/
	_5771004, /*Blepharotomy*/
	_5777000, /*Flexorplasty of elbow*/
	_5781000, /*Operation on nasal septum*/
	_5785009, /*Forensic autopsy*/
	_5787001, /*Elevation of bone fragments of orbit of skull with debridement*/
	_5789003, /*Lysis of adhesions of intestines*/
	_5796001, /*Excision of external thrombotic hemorrhoid*/
	_5806001, /*Revision of tracheostomy scar*/
	_5807005, /*Fenestration of inner ear,  initial*/
	_5809008, /*Selective vagotomy with pyloroplasty and gastrostomy*/
	_5812006, /*Laboratory reporting,  fax*/
	_5818005, /*Flocculation test*/
	_5821007, /*Ligation,  division and complete stripping of long and short saphenous veins*/
	_5823005, /*Diagnostic radiography,  left*/
	_5832007, /*Partial ostectomy of thorax,  ribs or sternum*/
	_5845006, /*Emulsification procedure*/
	_5846007, /*Diagnostic radiography of toes*/
	_5857002, /*Complement mediated cytotoxicity assay*/
	_5865004, /*Open reduction of dislocation of toe*/
	_5870006, /*Tertiary closure of abdominal wall*/
	_5880005, /*Clinical examination*/
	_5892005, /*Mastoid antrotomy*/
	_5894006, /*Methyl red test*/
	_5897004, /*Removal of Scribner shunt*/
	_5902003, /*History and physical examination,  complete*/
	_5925002, /*Incision and drainage of hematoma of wrist*/
	_5930003, /*Cardiac monitor removal*/
	_5947002, /*Consultation for hearing and/or speech problem*/
	_5961007, /*Division of blood vessels of cornea*/
	_5966002, /*Removal of foreign body from elbow area,  deep*/
	_5971009, /*Incision and drainage of axilla*/
	_5983006, /*Repair of spermatic cord*/
	_5986003, /*Non-sensitized spontaneous sheep erythrocyte binding,  E-rosette*/
	_5992009, /*Midtarsal arthrodesis,  multiple*/
	_5995006, /*Gas liquid chromatography,  flame photometric type*/
	_5997003, /*Drainage of cerebral subarachnoid space by aspiration*/
	_5998008, /*Radical dissection of groin*/
	_6005008, /*Transplantation of vitreous by anterior approach*/
	_6007000, /*Magnetic resonance imaging of chest*/
	_6019008, /*Endoscopy of large intestine*/
	_6025007, /*Laparoscopic appendectomy*/
	_6026008, /*Removal of coronary artery obstruction by percutaneous transluminal balloon with thrombolytic agent*/
	_6029001, /*Augmentation of outflow tract of pulmonary valve*/
	_6035001, /*Chart abstracting*/
	_6063004, /*Kanamycin measurement*/
	_6069000, /*Panniculotomy*/
	_6082008, /*Perforation of footplate*/
	_6092000, /*Aspiration of nasal sinus by puncture*/
	_6100001, /*Fenestration of stapes footplate with vein graft*/
	_6108008, /*Subdural tap through fontanel,  infant,  initial*/
	_6119006, /*Local destruction of lesion of bony palate*/
	_6125005, /*Change of gastrostomy tube*/
	_6126006, /*Fitzgerald factor assay*/
	_6127002, /*Diagnostic radiography of abdomen,  oblique standard*/
	_6130009, /*Surgical exposure of impacted or unerupted tooth to aid eruption*/
	_6133006, /*Lymphokine assay*/
	_6143009, /*Diabetic education*/
	_6146001, /*Repair of heart septum with prosthesis*/
	_6148000, /*Chondrectomy of semilunar cartilage of knee*/
	_6157006, /*Endoscopic retrograde cholangiopancreatography with biopsy*/
	_6159009, /*Galactose measurement*/
	_6161000, /*Excision of lesion of capsule of toes*/
	_6164008, /*Osteoclasis of clavicle*/
	_6166005, /*Nephropyeloureterostomy*/
	_6177004, /*Southern blot assay*/
	_6187000, /*Repair of aneurysm with graft of common femoral artery*/
	_6188005, /*Arthrotomy of knee*/
	_6189002, /*Excision of aberrant tissue of breast*/
	_6190006, /*Colopexy*/
	_6195001, /*Transurethral drainage of prostatic abscess*/
	_6198004, /*Repair of fracture with Sofield type procedure*/
	_6200005, /*Excision of lesion of female perineum*/
	_6205000, /*Fluorescent antigen,  titer*/
	_6213004, /*Prescribing corneoscleral contact lens*/
	_6221005, /*Suture of colon*/
	_6225001, /*Antibody detection,  RBC,  enzyme,  2 stage technique,  including anti-human globulin*/
	_6226000, /*Visual rehabilitation,  eye motion defect*/
	_6227009, /*Relationship psychotherapy*/
	_6231003, /*Graft of palate*/
	_6238009, /*Diagnostic radiography of sacroiliac joints*/
	_6240004, /*Operative procedure on knee*/
	_6255008, /*Resection of abdominal artery with replacement*/
	_6271008, /*Echography,  immersion B-scan*/
	_6274000, /*Excision of aural glomus tumor,  extended,  extratemporal*/
	_6286002, /*Destructive procedure on ovaries and fallopian tubes*/
	_6289009, /*White blood cell histogram evaluation*/
	_6295005, /*Sequestrectomy of pelvic bone*/
	_6307005, /*Keratophakia*/
	_6309008, /*Fecal fat differential,  quantitative*/
	_6319002, /*Beta lactamase,  chromogenic cephalosporin susceptibility test*/
	_6337001, /*Ligation of aortic arch*/
	_6339003, /*Conditioning play audiometry*/
	_6343004, /*Forensic bite mark comparison technique*/
	_6353003, /*Mitsuda reaction to lepromin*/
	_6354009, /*Sedimentation rate,  Westergren*/
	_6355005, /*Removal of internal fixation device of radius*/
	_6358007, /*Capsulorrhaphy of joint*/
	_6361008, /*Anesthesia for popliteal thromboendarterectomy*/
	_6363006, /*Dilation of lacrimal punctum with irrigation*/
	_6370006, /*Chemosurgery of stomach lesion*/
	_6384001, /*Removal of device from digestive system*/
	_6385000, /*Exploration of disc space*/
	_6388003, /*TdT stain*/
	_6396008, /*Galactokinase measurement*/
	_6397004, /*Muscular strength development exercise*/
	_6399001, /*Division of arteriovenous fistula with ligation*/
	_6402000, /*Excision of common bile duct*/
	_6403005, /*Lengthening of muscle of hand*/
	_6419003, /*Excision of tumor from elbow area,  deep,  subfascial*/
	_6429005, /*Heteroautogenous transplantation*/
	_6433003, /*Closed heart valvotomy of mitral valve*/
	_6434009, /*Seminal fluid detection*/
	_6438007, /*Exploration of ciliary body*/
	_6439004, /*Destruction of lesion of peripheral nerve*/
	_6443000, /*Pontic,  porcelain fused to predominantly base metal*/
	_6444006, /*Enlargement of eye socket*/
	_6465000, /*Arthrotomy of glenohumeral joint for infection with drainage*/
	_6466004, /*Administration of Rh immune globulin*/
	_6470007, /*Laparoamnioscopy*/
	_6473009, /*Suture of old obstetrical laceration of uterus*/
	_6480006, /*Urinary bladder residual urine study*/
	_6486000, /*Curettage of sclera*/
	_6487009, /*Hand tendon pulley reconstruction with tendon prosthesis*/
	_6491004, /*Protein S,  free assay*/
	_6499002, /*Tsuge operation on finger for macrodactyly repair*/
	_6502003, /*Complete lower denture*/
	_6506000, /*Placing a patient on a bedpan*/
	_6519001, /*Operation on multiple extraocular muscles with temporary detachment from globe*/
	_6521006, /*Polytomography*/
	_6527005, /*Uchida fimbriectomy with tubal ligation by endoscopy*/
	_6535008, /*Excision of cyst of hand*/
	_6536009, /*Implantation of tricuspid valve with tissue graft*/
	_6543003, /*Complicated catheterization of bladder*/
	_6547002, /*Repair with closure of non-surgical wound*/
	_6555009, /*Insertion of infusion pump beneath skin*/
	_6556005, /*Reticulin antibody measurement*/
	_6562000, /*Destruction of lesion of tongue*/
	_6563005, /*Transposition of muscle of hand*/
	_6567006, /*Pulmonary valve commissurotomy by transvenous balloon method*/
	_6568001, /*Diagnostic procedure on eyelid*/
	_6585004, /*Closed reduction of fracture of tarsal or metatarsal*/
	_6589005, /*Antibody titration,  high protein*/
	_6601003, /*Removal of foreign body from skin of axilla*/
	_6614002, /*Antibody to single stranded DNA measurement*/
	_6615001, /*Electroretinography with medical evaluation*/
	_6622009, /*Add clasp to existing partial denture*/
	_6634001, /*Destruction of hemorrhoids,  internal*/
	_6639006, /*Replacement of obstructed valve in shunt system*/
	_6650009, /*Radionuclide lacrimal flow study*/
	_6656003, /*Acoustic stimulation test*/
	_6657007, /*Maintenance drug therapy for mental disorder*/
	_6658002, /*Removal of foreign body from alveolus*/
	_6661001, /*King-Steelquist hindquarter operation*/
	_6665005, /*Restoration,  crown,  porcelain fused to noble metal*/
	_6668007, /*Fibrinogen assay,  quantitative*/
	_6670003, /*Closure of external fistula of trachea*/
	 NULL;
	
	/**
	 * The function gets the enum value associated with the string.
	 * @param codeString the code to evaluate
	 * @return the enumeration value for the code
	 * @throws FHIRException if the code is not known
	 */
	public static ServiceSequestAllCode fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return NULL;
		if ("_104001".equals(codeString)) return _104001;
		if ("_115006".equals(codeString)) return _115006;
		if ("_119000".equals(codeString)) return _119000;
		if ("_121005".equals(codeString)) return _121005;
		if ("_128004".equals(codeString)) return _128004;
		if ("_133000".equals(codeString)) return _133000;
		if ("_135007".equals(codeString)) return _135007;
		if ("_142007".equals(codeString)) return _142007;
		if ("_146005".equals(codeString)) return _146005;
		if ("_153001".equals(codeString)) return _153001;
		if ("_160007".equals(codeString)) return _160007;
		if ("_166001".equals(codeString)) return _166001;
		if ("_170009".equals(codeString)) return _170009;
		if ("_174000".equals(codeString)) return _174000;
		if ("_176003".equals(codeString)) return _176003;
		if ("_189009".equals(codeString)) return _189009;
		if ("_197002".equals(codeString)) return _197002;
		if ("_230009".equals(codeString)) return _230009;
		if ("_243009".equals(codeString)) return _243009;
		if ("_245002".equals(codeString)) return _245002;
		if ("_262007".equals(codeString)) return _262007;
		if ("_267001".equals(codeString)) return _267001;
		if ("_285008".equals(codeString)) return _285008;
		if ("_294002".equals(codeString)) return _294002;
		if ("_295001".equals(codeString)) return _295001;
		if ("_306005".equals(codeString)) return _306005;
		if ("_316002".equals(codeString)) return _316002;
		if ("_334003".equals(codeString)) return _334003;
		if ("_342002".equals(codeString)) return _342002;
		if ("_346004".equals(codeString)) return _346004;
		if ("_348003".equals(codeString)) return _348003;
		if ("_351005".equals(codeString)) return _351005;
		if ("_352003".equals(codeString)) return _352003;
		if ("_353008".equals(codeString)) return _353008;
		if ("_374009".equals(codeString)) return _374009;
		if ("_388008".equals(codeString)) return _388008;
		if ("_389000".equals(codeString)) return _389000;
		if ("_401004".equals(codeString)) return _401004;
		if ("_406009".equals(codeString)) return _406009;
		if ("_417005".equals(codeString)) return _417005;
		if ("_435001".equals(codeString)) return _435001;
		if ("_445004".equals(codeString)) return _445004;
		if ("_456004".equals(codeString)) return _456004;
		if ("_459006".equals(codeString)) return _459006;
		if ("_463004".equals(codeString)) return _463004;
		if ("_468008".equals(codeString)) return _468008;
		if ("_474008".equals(codeString)) return _474008;
		if ("_489004".equals(codeString)) return _489004;
		if ("_493005".equals(codeString)) return _493005;
		if ("_494004".equals(codeString)) return _494004;
		if ("_497006".equals(codeString)) return _497006;
		if ("_503003".equals(codeString)) return _503003;
		if ("_531007".equals(codeString)) return _531007;
		if ("_533005".equals(codeString)) return _533005;
		if ("_535003".equals(codeString)) return _535003;
		if ("_540006".equals(codeString)) return _540006;
		if ("_543008".equals(codeString)) return _543008;
		if ("_545001".equals(codeString)) return _545001;
		if ("_549007".equals(codeString)) return _549007;
		if ("_550007".equals(codeString)) return _550007;
		if ("_559008".equals(codeString)) return _559008;
		if ("_570001".equals(codeString)) return _570001;
		if ("_574005".equals(codeString)) return _574005;
		if ("_603006".equals(codeString)) return _603006;
		if ("_617002".equals(codeString)) return _617002;
		if ("_618007".equals(codeString)) return _618007;
		if ("_625000".equals(codeString)) return _625000;
		if ("_628003".equals(codeString)) return _628003;
		if ("_629006".equals(codeString)) return _629006;
		if ("_633004".equals(codeString)) return _633004;
		if ("_637003".equals(codeString)) return _637003;
		if ("_642006".equals(codeString)) return _642006;
		if ("_645008".equals(codeString)) return _645008;
		if ("_647000".equals(codeString)) return _647000;
		if ("_657004".equals(codeString)) return _657004;
		if ("_665001".equals(codeString)) return _665001;
		if ("_670008".equals(codeString)) return _670008;
		if ("_671007".equals(codeString)) return _671007;
		if ("_673005".equals(codeString)) return _673005;
		if ("_674004".equals(codeString)) return _674004;
		if ("_676002".equals(codeString)) return _676002;
		if ("_680007".equals(codeString)) return _680007;
		if ("_687005".equals(codeString)) return _687005;
		if ("_695009".equals(codeString)) return _695009;
		if ("_697001".equals(codeString)) return _697001;
		if ("_710006".equals(codeString)) return _710006;
		if ("_712003".equals(codeString)) return _712003;
		if ("_721002".equals(codeString)) return _721002;
		if ("_722009".equals(codeString)) return _722009;
		if ("_726007".equals(codeString)) return _726007;
		if ("_730005".equals(codeString)) return _730005;
		if ("_741007".equals(codeString)) return _741007;
		if ("_746002".equals(codeString)) return _746002;
		if ("_753006".equals(codeString)) return _753006;
		if ("_754000".equals(codeString)) return _754000;
		if ("_759005".equals(codeString)) return _759005;
		if ("_762008".equals(codeString)) return _762008;
		if ("_764009".equals(codeString)) return _764009;
		if ("_767002".equals(codeString)) return _767002;
		if ("_789003".equals(codeString)) return _789003;
		if ("_791006".equals(codeString)) return _791006;
		if ("_807005".equals(codeString)) return _807005;
		if ("_814007".equals(codeString)) return _814007;
		if ("_817000".equals(codeString)) return _817000;
		if ("_831000".equals(codeString)) return _831000;
		if ("_851001".equals(codeString)) return _851001;
		if ("_853003".equals(codeString)) return _853003;
		if ("_867007".equals(codeString)) return _867007;
		if ("_870006".equals(codeString)) return _870006;
		if ("_879007".equals(codeString)) return _879007;
		if ("_881009".equals(codeString)) return _881009;
		if ("_893000".equals(codeString)) return _893000;
		if ("_897004".equals(codeString)) return _897004;
		if ("_910002".equals(codeString)) return _910002;
		if ("_911003".equals(codeString)) return _911003;
		if ("_913000".equals(codeString)) return _913000;
		if ("_926001".equals(codeString)) return _926001;
		if ("_935008".equals(codeString)) return _935008;
		if ("_941001".equals(codeString)) return _941001;
		if ("_945005".equals(codeString)) return _945005;
		if ("_948007".equals(codeString)) return _948007;
		if ("_951000".equals(codeString)) return _951000;
		if ("_956005".equals(codeString)) return _956005;
		if ("_967006".equals(codeString)) return _967006;
		if ("_969009".equals(codeString)) return _969009;
		if ("_971009".equals(codeString)) return _971009;
		if ("_1001000".equals(codeString)) return _1001000;
		if ("_1008006".equals(codeString)) return _1008006;
		if ("_1019009".equals(codeString)) return _1019009;
		if ("_1021004".equals(codeString)) return _1021004;
		if ("_1029002".equals(codeString)) return _1029002;
		if ("_1032004".equals(codeString)) return _1032004;
		if ("_1035002".equals(codeString)) return _1035002;
		if ("_1036001".equals(codeString)) return _1036001;
		if ("_1041009".equals(codeString)) return _1041009;
		if ("_1042002".equals(codeString)) return _1042002;
		if ("_1043007".equals(codeString)) return _1043007;
		if ("_1044001".equals(codeString)) return _1044001;
		if ("_1048003".equals(codeString)) return _1048003;
		if ("_1054002".equals(codeString)) return _1054002;
		if ("_1071001".equals(codeString)) return _1071001;
		if ("_1084005".equals(codeString)) return _1084005;
		if ("_1093006".equals(codeString)) return _1093006;
		if ("_1103000".equals(codeString)) return _1103000;
		if ("_1104006".equals(codeString)) return _1104006;
		if ("_1115001".equals(codeString)) return _1115001;
		if ("_1119007".equals(codeString)) return _1119007;
		if ("_1121002".equals(codeString)) return _1121002;
		if ("_1127003".equals(codeString)) return _1127003;
		if ("_1133007".equals(codeString)) return _1133007;
		if ("_1163003".equals(codeString)) return _1163003;
		if ("_1176009".equals(codeString)) return _1176009;
		if ("_1181000".equals(codeString)) return _1181000;
		if ("_1186005".equals(codeString)) return _1186005;
		if ("_1198000".equals(codeString)) return _1198000;
		if ("_1209007".equals(codeString)) return _1209007;
		if ("_1225002".equals(codeString)) return _1225002;
		if ("_1227005".equals(codeString)) return _1227005;
		if ("_1235008".equals(codeString)) return _1235008;
		if ("_1237000".equals(codeString)) return _1237000;
		if ("_1238005".equals(codeString)) return _1238005;
		if ("_1251000".equals(codeString)) return _1251000;
		if ("_1253002".equals(codeString)) return _1253002;
		if ("_1258006".equals(codeString)) return _1258006;
		if ("_1266002".equals(codeString)) return _1266002;
		if ("_1267006".equals(codeString)) return _1267006;
		if ("_1278003".equals(codeString)) return _1278003;
		if ("_1279006".equals(codeString)) return _1279006;
		if ("_1292009".equals(codeString)) return _1292009;
		if ("_1299000".equals(codeString)) return _1299000;
		if ("_1315009".equals(codeString)) return _1315009;
		if ("_1316005".equals(codeString)) return _1316005;
		if ("_1324000".equals(codeString)) return _1324000;
		if ("_1327007".equals(codeString)) return _1327007;
		if ("_1328002".equals(codeString)) return _1328002;
		if ("_1329005".equals(codeString)) return _1329005;
		if ("_1337002".equals(codeString)) return _1337002;
		if ("_1339004".equals(codeString)) return _1339004;
		if ("_1347004".equals(codeString)) return _1347004;
		if ("_1352009".equals(codeString)) return _1352009;
		if ("_1358008".equals(codeString)) return _1358008;
		if ("_1366004".equals(codeString)) return _1366004;
		if ("_1385001".equals(codeString)) return _1385001;
		if ("_1390003".equals(codeString)) return _1390003;
		if ("_1398005".equals(codeString)) return _1398005;
		if ("_1399002".equals(codeString)) return _1399002;
		if ("_1407007".equals(codeString)) return _1407007;
		if ("_1410000".equals(codeString)) return _1410000;
		if ("_1411001".equals(codeString)) return _1411001;
		if ("_1413003".equals(codeString)) return _1413003;
		if ("_1414009".equals(codeString)) return _1414009;
		if ("_1417002".equals(codeString)) return _1417002;
		if ("_1431002".equals(codeString)) return _1431002;
		if ("_1440003".equals(codeString)) return _1440003;
		if ("_1449002".equals(codeString)) return _1449002;
		if ("_1453000".equals(codeString)) return _1453000;
		if ("_1455007".equals(codeString)) return _1455007;
		if ("_1457004".equals(codeString)) return _1457004;
		if ("_1494008".equals(codeString)) return _1494008;
		if ("_1500007".equals(codeString)) return _1500007;
		if ("_1501006".equals(codeString)) return _1501006;
		if ("_1505002".equals(codeString)) return _1505002;
		if ("_1529009".equals(codeString)) return _1529009;
		if ("_1533002".equals(codeString)) return _1533002;
		if ("_1550000".equals(codeString)) return _1550000;
		if ("_1555005".equals(codeString)) return _1555005;
		if ("_1559004".equals(codeString)) return _1559004;
		if ("_1576000".equals(codeString)) return _1576000;
		if ("_1577009".equals(codeString)) return _1577009;
		if ("_1578004".equals(codeString)) return _1578004;
		if ("_1583007".equals(codeString)) return _1583007;
		if ("_1585000".equals(codeString)) return _1585000;
		if ("_1596008".equals(codeString)) return _1596008;
		if ("_1597004".equals(codeString)) return _1597004;
		if ("_1602006".equals(codeString)) return _1602006;
		if ("_1614003".equals(codeString)) return _1614003;
		if ("_1615002".equals(codeString)) return _1615002;
		if ("_1616001".equals(codeString)) return _1616001;
		if ("_1636000".equals(codeString)) return _1636000;
		if ("_1638004".equals(codeString)) return _1638004;
		if ("_1640009".equals(codeString)) return _1640009;
		if ("_1645004".equals(codeString)) return _1645004;
		if ("_1651009".equals(codeString)) return _1651009;
		if ("_1653007".equals(codeString)) return _1653007;
		if ("_1669000".equals(codeString)) return _1669000;
		if ("_1677001".equals(codeString)) return _1677001;
		if ("_1678006".equals(codeString)) return _1678006;
		if ("_1680000".equals(codeString)) return _1680000;
		if ("_1683003".equals(codeString)) return _1683003;
		if ("_1689004".equals(codeString)) return _1689004;
		if ("_1691007".equals(codeString)) return _1691007;
		if ("_1699009".equals(codeString)) return _1699009;
		if ("_1702002".equals(codeString)) return _1702002;
		if ("_1704001".equals(codeString)) return _1704001;
		if ("_1709006".equals(codeString)) return _1709006;
		if ("_1712009".equals(codeString)) return _1712009;
		if ("_1713004".equals(codeString)) return _1713004;
		if ("_1730002".equals(codeString)) return _1730002;
		if ("_1746005".equals(codeString)) return _1746005;
		if ("_1747001".equals(codeString)) return _1747001;
		if ("_1753001".equals(codeString)) return _1753001;
		if ("_1757000".equals(codeString)) return _1757000;
		if ("_1759002".equals(codeString)) return _1759002;
		if ("_1770009".equals(codeString)) return _1770009;
		if ("_1774000".equals(codeString)) return _1774000;
		if ("_1775004".equals(codeString)) return _1775004;
		if ("_1784004".equals(codeString)) return _1784004;
		if ("_1787006".equals(codeString)) return _1787006;
		if ("_1788001".equals(codeString)) return _1788001;
		if ("_1801001".equals(codeString)) return _1801001;
		if ("_1805005".equals(codeString)) return _1805005;
		if ("_1811008".equals(codeString)) return _1811008;
		if ("_1813006".equals(codeString)) return _1813006;
		if ("_1820004".equals(codeString)) return _1820004;
		if ("_1830008".equals(codeString)) return _1830008;
		if ("_1836002".equals(codeString)) return _1836002;
		if ("_1844002".equals(codeString)) return _1844002;
		if ("_1854003".equals(codeString)) return _1854003;
		if ("_1859008".equals(codeString)) return _1859008;
		if ("_1861004".equals(codeString)) return _1861004;
		if ("_1862006".equals(codeString)) return _1862006;
		if ("_1866009".equals(codeString)) return _1866009;
		if ("_1868005".equals(codeString)) return _1868005;
		if ("_1870001".equals(codeString)) return _1870001;
		if ("_1871002".equals(codeString)) return _1871002;
		if ("_1872009".equals(codeString)) return _1872009;
		if ("_1876007".equals(codeString)) return _1876007;
		if ("_1879000".equals(codeString)) return _1879000;
		if ("_1889001".equals(codeString)) return _1889001;
		if ("_1906007".equals(codeString)) return _1906007;
		if ("_1907003".equals(codeString)) return _1907003;
		if ("_1917008".equals(codeString)) return _1917008;
		if ("_1924009".equals(codeString)) return _1924009;
		if ("_1950008".equals(codeString)) return _1950008;
		if ("_1958001".equals(codeString)) return _1958001;
		if ("_1966005".equals(codeString)) return _1966005;
		if ("_1983001".equals(codeString)) return _1983001;
		if ("_1995001".equals(codeString)) return _1995001;
		if ("_1999007".equals(codeString)) return _1999007;
		if ("_2002009".equals(codeString)) return _2002009;
		if ("_2021001".equals(codeString)) return _2021001;
		if ("_2051007".equals(codeString)) return _2051007;
		if ("_2054004".equals(codeString)) return _2054004;
		if ("_2067001".equals(codeString)) return _2067001;
		if ("_2069003".equals(codeString)) return _2069003;
		if ("_2078009".equals(codeString)) return _2078009;
		if ("_2079001".equals(codeString)) return _2079001;
		if ("_2080003".equals(codeString)) return _2080003;
		if ("_2098004".equals(codeString)) return _2098004;
		if ("_2115003".equals(codeString)) return _2115003;
		if ("_2119009".equals(codeString)) return _2119009;
		if ("_2127000".equals(codeString)) return _2127000;
		if ("_2137005".equals(codeString)) return _2137005;
		if ("_2153008".equals(codeString)) return _2153008;
		if ("_2161003".equals(codeString)) return _2161003;
		if ("_2164006".equals(codeString)) return _2164006;
		if ("_2166008".equals(codeString)) return _2166008;
		if ("_2171001".equals(codeString)) return _2171001;
		if ("_2178007".equals(codeString)) return _2178007;
		if ("_2181002".equals(codeString)) return _2181002;
		if ("_2188008".equals(codeString)) return _2188008;
		if ("_2193006".equals(codeString)) return _2193006;
		if ("_2196003".equals(codeString)) return _2196003;
		if ("_2199005".equals(codeString)) return _2199005;
		if ("_2214008".equals(codeString)) return _2214008;
		if ("_2220009".equals(codeString)) return _2220009;
		if ("_2225004".equals(codeString)) return _2225004;
		if ("_2234009".equals(codeString)) return _2234009;
		if ("_2238007".equals(codeString)) return _2238007;
		if ("_2242005".equals(codeString)) return _2242005;
		if ("_2244006".equals(codeString)) return _2244006;
		if ("_2250001".equals(codeString)) return _2250001;
		if ("_2252009".equals(codeString)) return _2252009;
		if ("_2266004".equals(codeString)) return _2266004;
		if ("_2267008".equals(codeString)) return _2267008;
		if ("_2270007".equals(codeString)) return _2270007;
		if ("_2276001".equals(codeString)) return _2276001;
		if ("_2278000".equals(codeString)) return _2278000;
		if ("_2279008".equals(codeString)) return _2279008;
		if ("_2290003".equals(codeString)) return _2290003;
		if ("_2315006".equals(codeString)) return _2315006;
		if ("_2318008".equals(codeString)) return _2318008;
		if ("_2321005".equals(codeString)) return _2321005;
		if ("_2322003".equals(codeString)) return _2322003;
		if ("_2337004".equals(codeString)) return _2337004;
		if ("_2344008".equals(codeString)) return _2344008;
		if ("_2347001".equals(codeString)) return _2347001;
		if ("_2364003".equals(codeString)) return _2364003;
		if ("_2371008".equals(codeString)) return _2371008;
		if ("_2373006".equals(codeString)) return _2373006;
		if ("_2382000".equals(codeString)) return _2382000;
		if ("_2386002".equals(codeString)) return _2386002;
		if ("_2393003".equals(codeString)) return _2393003;
		if ("_2406000".equals(codeString)) return _2406000;
		if ("_2407009".equals(codeString)) return _2407009;
		if ("_2408004".equals(codeString)) return _2408004;
		if ("_2409007".equals(codeString)) return _2409007;
		if ("_2425002".equals(codeString)) return _2425002;
		if ("_2442008".equals(codeString)) return _2442008;
		if ("_2448007".equals(codeString)) return _2448007;
		if ("_2455009".equals(codeString)) return _2455009;
		if ("_2457001".equals(codeString)) return _2457001;
		if ("_2458006".equals(codeString)) return _2458006;
		if ("_2459003".equals(codeString)) return _2459003;
		if ("_2461007".equals(codeString)) return _2461007;
		if ("_2474001".equals(codeString)) return _2474001;
		if ("_2475000".equals(codeString)) return _2475000;
		if ("_2480009".equals(codeString)) return _2480009;
		if ("_2486003".equals(codeString)) return _2486003;
		if ("_2488002".equals(codeString)) return _2488002;
		if ("_2494005".equals(codeString)) return _2494005;
		if ("_2498008".equals(codeString)) return _2498008;
		if ("_2507007".equals(codeString)) return _2507007;
		if ("_2508002".equals(codeString)) return _2508002;
		if ("_2514009".equals(codeString)) return _2514009;
		if ("_2517002".equals(codeString)) return _2517002;
		if ("_2530001".equals(codeString)) return _2530001;
		if ("_2531002".equals(codeString)) return _2531002;
		if ("_2535006".equals(codeString)) return _2535006;
		if ("_2536007".equals(codeString)) return _2536007;
		if ("_2547000".equals(codeString)) return _2547000;
		if ("_2552005".equals(codeString)) return _2552005;
		if ("_2564002".equals(codeString)) return _2564002;
		if ("_2566000".equals(codeString)) return _2566000;
		if ("_2567009".equals(codeString)) return _2567009;
		if ("_2580007".equals(codeString)) return _2580007;
		if ("_2598006".equals(codeString)) return _2598006;
		if ("_2601001".equals(codeString)) return _2601001;
		if ("_2607002".equals(codeString)) return _2607002;
		if ("_2613006".equals(codeString)) return _2613006;
		if ("_2614000".equals(codeString)) return _2614000;
		if ("_2616003".equals(codeString)) return _2616003;
		if ("_2619005".equals(codeString)) return _2619005;
		if ("_2629003".equals(codeString)) return _2629003;
		if ("_2632000".equals(codeString)) return _2632000;
		if ("_2642003".equals(codeString)) return _2642003;
		if ("_2643008".equals(codeString)) return _2643008;
		if ("_2644002".equals(codeString)) return _2644002;
		if ("_2645001".equals(codeString)) return _2645001;
		if ("_2646000".equals(codeString)) return _2646000;
		if ("_2658000".equals(codeString)) return _2658000;
		if ("_2659008".equals(codeString)) return _2659008;
		if ("_2668005".equals(codeString)) return _2668005;
		if ("_2670001".equals(codeString)) return _2670001;
		if ("_2673004".equals(codeString)) return _2673004;
		if ("_2677003".equals(codeString)) return _2677003;
		if ("_2690005".equals(codeString)) return _2690005;
		if ("_2693007".equals(codeString)) return _2693007;
		if ("_2696004".equals(codeString)) return _2696004;
		if ("_2697008".equals(codeString)) return _2697008;
		if ("_2716009".equals(codeString)) return _2716009;
		if ("_2722000".equals(codeString)) return _2722000;
		if ("_2731000".equals(codeString)) return _2731000;
		if ("_2732007".equals(codeString)) return _2732007;
		if ("_2737001".equals(codeString)) return _2737001;
		if ("_2742009".equals(codeString)) return _2742009;
		if ("_2743004".equals(codeString)) return _2743004;
		if ("_2745006".equals(codeString)) return _2745006;
		if ("_2752008".equals(codeString)) return _2752008;
		if ("_2780005".equals(codeString)) return _2780005;
		if ("_2794006".equals(codeString)) return _2794006;
		if ("_2802005".equals(codeString)) return _2802005;
		if ("_2811005".equals(codeString)) return _2811005;
		if ("_2813008".equals(codeString)) return _2813008;
		if ("_2837008".equals(codeString)) return _2837008;
		if ("_2842000".equals(codeString)) return _2842000;
		if ("_2843005".equals(codeString)) return _2843005;
		if ("_2847006".equals(codeString)) return _2847006;
		if ("_2851008".equals(codeString)) return _2851008;
		if ("_2854000".equals(codeString)) return _2854000;
		if ("_2857007".equals(codeString)) return _2857007;
		if ("_2866006".equals(codeString)) return _2866006;
		if ("_2875008".equals(codeString)) return _2875008;
		if ("_2876009".equals(codeString)) return _2876009;
		if ("_2885009".equals(codeString)) return _2885009;
		if ("_2891006".equals(codeString)) return _2891006;
		if ("_2898000".equals(codeString)) return _2898000;
		if ("_2903001".equals(codeString)) return _2903001;
		if ("_2908005".equals(codeString)) return _2908005;
		if ("_2914003".equals(codeString)) return _2914003;
		if ("_2915002".equals(codeString)) return _2915002;
		if ("_2933008".equals(codeString)) return _2933008;
		if ("_2945004".equals(codeString)) return _2945004;
		if ("_2947007".equals(codeString)) return _2947007;
		if ("_2960001".equals(codeString)) return _2960001;
		if ("_2968008".equals(codeString)) return _2968008;
		if ("_2970004".equals(codeString)) return _2970004;
		if ("_2971000".equals(codeString)) return _2971000;
		if ("_2977001".equals(codeString)) return _2977001;
		if ("_3001009".equals(codeString)) return _3001009;
		if ("_3010001".equals(codeString)) return _3010001;
		if ("_3016007".equals(codeString)) return _3016007;
		if ("_3025001".equals(codeString)) return _3025001;
		if ("_3026000".equals(codeString)) return _3026000;
		if ("_3029007".equals(codeString)) return _3029007;
		if ("_3041000".equals(codeString)) return _3041000;
		if ("_3047001".equals(codeString)) return _3047001;
		if ("_3060007".equals(codeString)) return _3060007;
		if ("_3061006".equals(codeString)) return _3061006;
		if ("_3063009".equals(codeString)) return _3063009;
		if ("_3075004".equals(codeString)) return _3075004;
		if ("_3078002".equals(codeString)) return _3078002;
		if ("_3083005".equals(codeString)) return _3083005;
		if ("_3088001".equals(codeString)) return _3088001;
		if ("_3090000".equals(codeString)) return _3090000;
		if ("_3112006".equals(codeString)) return _3112006;
		if ("_3116009".equals(codeString)) return _3116009;
		if ("_3130004".equals(codeString)) return _3130004;
		if ("_3133002".equals(codeString)) return _3133002;
		if ("_3137001".equals(codeString)) return _3137001;
		if ("_3143004".equals(codeString)) return _3143004;
		if ("_3162001".equals(codeString)) return _3162001;
		if ("_3164000".equals(codeString)) return _3164000;
		if ("_3165004".equals(codeString)) return _3165004;
		if ("_3166003".equals(codeString)) return _3166003;
		if ("_3177009".equals(codeString)) return _3177009;
		if ("_3183007".equals(codeString)) return _3183007;
		if ("_3186004".equals(codeString)) return _3186004;
		if ("_3190002".equals(codeString)) return _3190002;
		if ("_3204007".equals(codeString)) return _3204007;
		if ("_3241008".equals(codeString)) return _3241008;
		if ("_3249005".equals(codeString)) return _3249005;
		if ("_3251009".equals(codeString)) return _3251009;
		if ("_3256004".equals(codeString)) return _3256004;
		if ("_3257008".equals(codeString)) return _3257008;
		if ("_3258003".equals(codeString)) return _3258003;
		if ("_3268008".equals(codeString)) return _3268008;
		if ("_3270004".equals(codeString)) return _3270004;
		if ("_3278006".equals(codeString)) return _3278006;
		if ("_3287002".equals(codeString)) return _3287002;
		if ("_3320000".equals(codeString)) return _3320000;
		if ("_3324009".equals(codeString)) return _3324009;
		if ("_3326006".equals(codeString)) return _3326006;
		if ("_3328007".equals(codeString)) return _3328007;
		if ("_3333006".equals(codeString)) return _3333006;
		if ("_3338002".equals(codeString)) return _3338002;
		if ("_3352000".equals(codeString)) return _3352000;
		if ("_3357006".equals(codeString)) return _3357006;
		if ("_3360004".equals(codeString)) return _3360004;
		if ("_3390006".equals(codeString)) return _3390006;
		if ("_3399007".equals(codeString)) return _3399007;
		if ("_3407002".equals(codeString)) return _3407002;
		if ("_3413006".equals(codeString)) return _3413006;
		if ("_3418002".equals(codeString)) return _3418002;
		if ("_3432000".equals(codeString)) return _3432000;
		if ("_3443008".equals(codeString)) return _3443008;
		if ("_3448004".equals(codeString)) return _3448004;
		if ("_3450007".equals(codeString)) return _3450007;
		if ("_3457005".equals(codeString)) return _3457005;
		if ("_3479000".equals(codeString)) return _3479000;
		if ("_3498003".equals(codeString)) return _3498003;
		if ("_3499006".equals(codeString)) return _3499006;
		if ("_3509001".equals(codeString)) return _3509001;
		if ("_3512003".equals(codeString)) return _3512003;
		if ("_3515001".equals(codeString)) return _3515001;
		if ("_3517009".equals(codeString)) return _3517009;
		if ("_3518004".equals(codeString)) return _3518004;
		if ("_3527003".equals(codeString)) return _3527003;
		if ("_3546002".equals(codeString)) return _3546002;
		if ("_3559005".equals(codeString)) return _3559005;
		if ("_3562008".equals(codeString)) return _3562008;
		if ("_3564009".equals(codeString)) return _3564009;
		if ("_3575008".equals(codeString)) return _3575008;
		if ("_3580004".equals(codeString)) return _3580004;
		if ("_3605001".equals(codeString)) return _3605001;
		if ("_3607009".equals(codeString)) return _3607009;
		if ("_3620007".equals(codeString)) return _3620007;
		if ("_3625002".equals(codeString)) return _3625002;
		if ("_3651000".equals(codeString)) return _3651000;
		if ("_3654008".equals(codeString)) return _3654008;
		if ("_3659003".equals(codeString)) return _3659003;
		if ("_3664004".equals(codeString)) return _3664004;
		if ("_3666002".equals(codeString)) return _3666002;
		if ("_3669009".equals(codeString)) return _3669009;
		if ("_3673007".equals(codeString)) return _3673007;
		if ("_3683006".equals(codeString)) return _3683006;
		if ("_3686003".equals(codeString)) return _3686003;
		if ("_3688002".equals(codeString)) return _3688002;
		if ("_3690001".equals(codeString)) return _3690001;
		if ("_3691002".equals(codeString)) return _3691002;
		if ("_3697003".equals(codeString)) return _3697003;
		if ("_3700004".equals(codeString)) return _3700004;
		if ("_3701000".equals(codeString)) return _3701000;
		if ("_3713005".equals(codeString)) return _3713005;
		if ("_3717006".equals(codeString)) return _3717006;
		if ("_3734003".equals(codeString)) return _3734003;
		if ("_3735002".equals(codeString)) return _3735002;
		if ("_3740005".equals(codeString)) return _3740005;
		if ("_3748003".equals(codeString)) return _3748003;
		if ("_3749006".equals(codeString)) return _3749006;
		if ("_3758004".equals(codeString)) return _3758004;
		if ("_3770000".equals(codeString)) return _3770000;
		if ("_3778007".equals(codeString)) return _3778007;
		if ("_3780001".equals(codeString)) return _3780001;
		if ("_3784005".equals(codeString)) return _3784005;
		if ("_3786007".equals(codeString)) return _3786007;
		if ("_3787003".equals(codeString)) return _3787003;
		if ("_3794000".equals(codeString)) return _3794000;
		if ("_3796003".equals(codeString)) return _3796003;
		if ("_3799005".equals(codeString)) return _3799005;
		if ("_3802001".equals(codeString)) return _3802001;
		if ("_3819004".equals(codeString)) return _3819004;
		if ("_3826004".equals(codeString)) return _3826004;
		if ("_3828003".equals(codeString)) return _3828003;
		if ("_3831002".equals(codeString)) return _3831002;
		if ("_3843001".equals(codeString)) return _3843001;
		if ("_3858009".equals(codeString)) return _3858009;
		if ("_3861005".equals(codeString)) return _3861005;
		if ("_3862003".equals(codeString)) return _3862003;
		if ("_3864002".equals(codeString)) return _3864002;
		if ("_3880007".equals(codeString)) return _3880007;
		if ("_3881006".equals(codeString)) return _3881006;
		if ("_3887005".equals(codeString)) return _3887005;
		if ("_3889008".equals(codeString)) return _3889008;
		if ("_3891000".equals(codeString)) return _3891000;
		if ("_3895009".equals(codeString)) return _3895009;
		if ("_3907006".equals(codeString)) return _3907006;
		if ("_3911000".equals(codeString)) return _3911000;
		if ("_3915009".equals(codeString)) return _3915009;
		if ("_3917001".equals(codeString)) return _3917001;
		if ("_3918006".equals(codeString)) return _3918006;
		if ("_3926003".equals(codeString)) return _3926003;
		if ("_3929005".equals(codeString)) return _3929005;
		if ("_3936006".equals(codeString)) return _3936006;
		if ("_3938007".equals(codeString)) return _3938007;
		if ("_3942005".equals(codeString)) return _3942005;
		if ("_3955006".equals(codeString)) return _3955006;
		if ("_3957003".equals(codeString)) return _3957003;
		if ("_3963007".equals(codeString)) return _3963007;
		if ("_3967008".equals(codeString)) return _3967008;
		if ("_3968003".equals(codeString)) return _3968003;
		if ("_3969006".equals(codeString)) return _3969006;
		if ("_3971006".equals(codeString)) return _3971006;
		if ("_3980006".equals(codeString)) return _3980006;
		if ("_3981005".equals(codeString)) return _3981005;
		if ("_3985001".equals(codeString)) return _3985001;
		if ("_3991004".equals(codeString)) return _3991004;
		if ("_3998005".equals(codeString)) return _3998005;
		if ("_4007002".equals(codeString)) return _4007002;
		if ("_4008007".equals(codeString)) return _4008007;
		if ("_4010009".equals(codeString)) return _4010009;
		if ("_4027001".equals(codeString)) return _4027001;
		if ("_4034004".equals(codeString)) return _4034004;
		if ("_4035003".equals(codeString)) return _4035003;
		if ("_4036002".equals(codeString)) return _4036002;
		if ("_4037006".equals(codeString)) return _4037006;
		if ("_4044002".equals(codeString)) return _4044002;
		if ("_4045001".equals(codeString)) return _4045001;
		if ("_4052004".equals(codeString)) return _4052004;
		if ("_4064007".equals(codeString)) return _4064007;
		if ("_4068005".equals(codeString)) return _4068005;
		if ("_4083000".equals(codeString)) return _4083000;
		if ("_4084006".equals(codeString)) return _4084006;
		if ("_4090005".equals(codeString)) return _4090005;
		if ("_4094001".equals(codeString)) return _4094001;
		if ("_4101004".equals(codeString)) return _4101004;
		if ("_4102006".equals(codeString)) return _4102006;
		if ("_4114003".equals(codeString)) return _4114003;
		if ("_4116001".equals(codeString)) return _4116001;
		if ("_4119008".equals(codeString)) return _4119008;
		if ("_4131005".equals(codeString)) return _4131005;
		if ("_4134002".equals(codeString)) return _4134002;
		if ("_4139007".equals(codeString)) return _4139007;
		if ("_4143006".equals(codeString)) return _4143006;
		if ("_4149005".equals(codeString)) return _4149005;
		if ("_4154001".equals(codeString)) return _4154001;
		if ("_4165006".equals(codeString)) return _4165006;
		if ("_4176005".equals(codeString)) return _4176005;
		if ("_4192000".equals(codeString)) return _4192000;
		if ("_4213001".equals(codeString)) return _4213001;
		if ("_4214007".equals(codeString)) return _4214007;
		if ("_4226002".equals(codeString)) return _4226002;
		if ("_4252008".equals(codeString)) return _4252008;
		if ("_4263006".equals(codeString)) return _4263006;
		if ("_4266003".equals(codeString)) return _4266003;
		if ("_4285000".equals(codeString)) return _4285000;
		if ("_4293000".equals(codeString)) return _4293000;
		if ("_4304000".equals(codeString)) return _4304000;
		if ("_4319004".equals(codeString)) return _4319004;
		if ("_4321009".equals(codeString)) return _4321009;
		if ("_4323007".equals(codeString)) return _4323007;
		if ("_4331002".equals(codeString)) return _4331002;
		if ("_4333004".equals(codeString)) return _4333004;
		if ("_4336007".equals(codeString)) return _4336007;
		if ("_4337003".equals(codeString)) return _4337003;
		if ("_4339000".equals(codeString)) return _4339000;
		if ("_4341004".equals(codeString)) return _4341004;
		if ("_4344007".equals(codeString)) return _4344007;
		if ("_4348005".equals(codeString)) return _4348005;
		if ("_4350002".equals(codeString)) return _4350002;
		if ("_4363008".equals(codeString)) return _4363008;
		if ("_4365001".equals(codeString)) return _4365001;
		if ("_4380007".equals(codeString)) return _4380007;
		if ("_4387005".equals(codeString)) return _4387005;
		if ("_4388000".equals(codeString)) return _4388000;
		if ("_4407008".equals(codeString)) return _4407008;
		if ("_4411002".equals(codeString)) return _4411002;
		if ("_4420006".equals(codeString)) return _4420006;
		if ("_4424002".equals(codeString)) return _4424002;
		if ("_4436008".equals(codeString)) return _4436008;
		if ("_4438009".equals(codeString)) return _4438009;
		if ("_4443002".equals(codeString)) return _4443002;
		if ("_4447001".equals(codeString)) return _4447001;
		if ("_4449003".equals(codeString)) return _4449003;
		if ("_4450003".equals(codeString)) return _4450003;
		if ("_4455008".equals(codeString)) return _4455008;
		if ("_4457000".equals(codeString)) return _4457000;
		if ("_4466001".equals(codeString)) return _4466001;
		if ("_4467005".equals(codeString)) return _4467005;
		if ("_4475004".equals(codeString)) return _4475004;
		if ("_4487006".equals(codeString)) return _4487006;
		if ("_4489009".equals(codeString)) return _4489009;
		if ("_4496006".equals(codeString)) return _4496006;
		if ("_4503005".equals(codeString)) return _4503005;
		if ("_4504004".equals(codeString)) return _4504004;
		if ("_4505003".equals(codeString)) return _4505003;
		if ("_4507006".equals(codeString)) return _4507006;
		if ("_4511000".equals(codeString)) return _4511000;
		if ("_4516005".equals(codeString)) return _4516005;
		if ("_4520009".equals(codeString)) return _4520009;
		if ("_4525004".equals(codeString)) return _4525004;
		if ("_4533003".equals(codeString)) return _4533003;
		if ("_4535005".equals(codeString)) return _4535005;
		if ("_4539004".equals(codeString)) return _4539004;
		if ("_4542005".equals(codeString)) return _4542005;
		if ("_4544006".equals(codeString)) return _4544006;
		if ("_4558008".equals(codeString)) return _4558008;
		if ("_4563007".equals(codeString)) return _4563007;
		if ("_4570007".equals(codeString)) return _4570007;
		if ("_4579008".equals(codeString)) return _4579008;
		if ("_4581005".equals(codeString)) return _4581005;
		if ("_4585001".equals(codeString)) return _4585001;
		if ("_4587009".equals(codeString)) return _4587009;
		if ("_4589007".equals(codeString)) return _4589007;
		if ("_4593001".equals(codeString)) return _4593001;
		if ("_4594007".equals(codeString)) return _4594007;
		if ("_4613005".equals(codeString)) return _4613005;
		if ("_4625008".equals(codeString)) return _4625008;
		if ("_4626009".equals(codeString)) return _4626009;
		if ("_4636001".equals(codeString)) return _4636001;
		if ("_4640005".equals(codeString)) return _4640005;
		if ("_4642002".equals(codeString)) return _4642002;
		if ("_4660002".equals(codeString)) return _4660002;
		if ("_4670000".equals(codeString)) return _4670000;
		if ("_4671001".equals(codeString)) return _4671001;
		if ("_4672008".equals(codeString)) return _4672008;
		if ("_4691008".equals(codeString)) return _4691008;
		if ("_4692001".equals(codeString)) return _4692001;
		if ("_4694000".equals(codeString)) return _4694000;
		if ("_4699005".equals(codeString)) return _4699005;
		if ("_4701005".equals(codeString)) return _4701005;
		if ("_4707009".equals(codeString)) return _4707009;
		if ("_4712005".equals(codeString)) return _4712005;
		if ("_4713000".equals(codeString)) return _4713000;
		if ("_4719001".equals(codeString)) return _4719001;
		if ("_4727005".equals(codeString)) return _4727005;
		if ("_4734007".equals(codeString)) return _4734007;
		if ("_4737000".equals(codeString)) return _4737000;
		if ("_4756005".equals(codeString)) return _4756005;
		if ("_4758006".equals(codeString)) return _4758006;
		if ("_4764004".equals(codeString)) return _4764004;
		if ("_4765003".equals(codeString)) return _4765003;
		if ("_4770005".equals(codeString)) return _4770005;
		if ("_4772002".equals(codeString)) return _4772002;
		if ("_4784000".equals(codeString)) return _4784000;
		if ("_4804005".equals(codeString)) return _4804005;
		if ("_4811009".equals(codeString)) return _4811009;
		if ("_4815000".equals(codeString)) return _4815000;
		if ("_4820000".equals(codeString)) return _4820000;
		if ("_4827002".equals(codeString)) return _4827002;
		if ("_4829004".equals(codeString)) return _4829004;
		if ("_4847005".equals(codeString)) return _4847005;
		if ("_4849008".equals(codeString)) return _4849008;
		if ("_4862007".equals(codeString)) return _4862007;
		if ("_4877004".equals(codeString)) return _4877004;
		if ("_4891005".equals(codeString)) return _4891005;
		if ("_4895001".equals(codeString)) return _4895001;
		if ("_4902005".equals(codeString)) return _4902005;
		if ("_4903000".equals(codeString)) return _4903000;
		if ("_4904006".equals(codeString)) return _4904006;
		if ("_4914002".equals(codeString)) return _4914002;
		if ("_4929000".equals(codeString)) return _4929000;
		if ("_4930005".equals(codeString)) return _4930005;
		if ("_4934001".equals(codeString)) return _4934001;
		if ("_4957007".equals(codeString)) return _4957007;
		if ("_4966006".equals(codeString)) return _4966006;
		if ("_4970003".equals(codeString)) return _4970003;
		if ("_4974007".equals(codeString)) return _4974007;
		if ("_4976009".equals(codeString)) return _4976009;
		if ("_4987001".equals(codeString)) return _4987001;
		if ("_4992004".equals(codeString)) return _4992004;
		if ("_4993009".equals(codeString)) return _4993009;
		if ("_5016005".equals(codeString)) return _5016005;
		if ("_5019003".equals(codeString)) return _5019003;
		if ("_5021008".equals(codeString)) return _5021008;
		if ("_5022001".equals(codeString)) return _5022001;
		if ("_5025004".equals(codeString)) return _5025004;
		if ("_5032008".equals(codeString)) return _5032008;
		if ("_5034009".equals(codeString)) return _5034009;
		if ("_5048009".equals(codeString)) return _5048009;
		if ("_5055006".equals(codeString)) return _5055006;
		if ("_5057003".equals(codeString)) return _5057003;
		if ("_5065000".equals(codeString)) return _5065000;
		if ("_5091004".equals(codeString)) return _5091004;
		if ("_5105000".equals(codeString)) return _5105000;
		if ("_5110001".equals(codeString)) return _5110001;
		if ("_5113004".equals(codeString)) return _5113004;
		if ("_5119000".equals(codeString)) return _5119000;
		if ("_5121005".equals(codeString)) return _5121005;
		if ("_5123008".equals(codeString)) return _5123008;
		if ("_5130002".equals(codeString)) return _5130002;
		if ("_5131003".equals(codeString)) return _5131003;
		if ("_5135007".equals(codeString)) return _5135007;
		if ("_5147001".equals(codeString)) return _5147001;
		if ("_5151004".equals(codeString)) return _5151004;
		if ("_5154007".equals(codeString)) return _5154007;
		if ("_5161006".equals(codeString)) return _5161006;
		if ("_5162004".equals(codeString)) return _5162004;
		if ("_5165002".equals(codeString)) return _5165002;
		if ("_5176003".equals(codeString)) return _5176003;
		if ("_5182000".equals(codeString)) return _5182000;
		if ("_5184004".equals(codeString)) return _5184004;
		if ("_5186002".equals(codeString)) return _5186002;
		if ("_5190000".equals(codeString)) return _5190000;
		if ("_5191001".equals(codeString)) return _5191001;
		if ("_5212002".equals(codeString)) return _5212002;
		if ("_5216004".equals(codeString)) return _5216004;
		if ("_5233006".equals(codeString)) return _5233006;
		if ("_5243009".equals(codeString)) return _5243009;
		if ("_5245002".equals(codeString)) return _5245002;
		if ("_5246001".equals(codeString)) return _5246001;
		if ("_5264008".equals(codeString)) return _5264008;
		if ("_5267001".equals(codeString)) return _5267001;
		if ("_5270002".equals(codeString)) return _5270002;
		if ("_5273000".equals(codeString)) return _5273000;
		if ("_5282006".equals(codeString)) return _5282006;
		if ("_5290006".equals(codeString)) return _5290006;
		if ("_5298004".equals(codeString)) return _5298004;
		if ("_5304008".equals(codeString)) return _5304008;
		if ("_5316002".equals(codeString)) return _5316002;
		if ("_5317006".equals(codeString)) return _5317006;
		if ("_5326009".equals(codeString)) return _5326009;
		if ("_5328005".equals(codeString)) return _5328005;
		if ("_5337005".equals(codeString)) return _5337005;
		if ("_5338000".equals(codeString)) return _5338000;
		if ("_5342002".equals(codeString)) return _5342002;
		if ("_5348003".equals(codeString)) return _5348003;
		if ("_5357009".equals(codeString)) return _5357009;
		if ("_5373003".equals(codeString)) return _5373003;
		if ("_5384005".equals(codeString)) return _5384005;
		if ("_5391008".equals(codeString)) return _5391008;
		if ("_5393006".equals(codeString)) return _5393006;
		if ("_5402006".equals(codeString)) return _5402006;
		if ("_5407000".equals(codeString)) return _5407000;
		if ("_5415002".equals(codeString)) return _5415002;
		if ("_5419008".equals(codeString)) return _5419008;
		if ("_5422005".equals(codeString)) return _5422005;
		if ("_5429001".equals(codeString)) return _5429001;
		if ("_5431005".equals(codeString)) return _5431005;
		if ("_5433008".equals(codeString)) return _5433008;
		if ("_5446003".equals(codeString)) return _5446003;
		if ("_5447007".equals(codeString)) return _5447007;
		if ("_5452002".equals(codeString)) return _5452002;
		if ("_5456004".equals(codeString)) return _5456004;
		if ("_5457008".equals(codeString)) return _5457008;
		if ("_5460001".equals(codeString)) return _5460001;
		if ("_5479003".equals(codeString)) return _5479003;
		if ("_5482008".equals(codeString)) return _5482008;
		if ("_5486006".equals(codeString)) return _5486006;
		if ("_5489004".equals(codeString)) return _5489004;
		if ("_5506006".equals(codeString)) return _5506006;
		if ("_5517007".equals(codeString)) return _5517007;
		if ("_5521000".equals(codeString)) return _5521000;
		if ("_5536002".equals(codeString)) return _5536002;
		if ("_5545001".equals(codeString)) return _5545001;
		if ("_5551006".equals(codeString)) return _5551006;
		if ("_5556001".equals(codeString)) return _5556001;
		if ("_5570001".equals(codeString)) return _5570001;
		if ("_5571002".equals(codeString)) return _5571002;
		if ("_5572009".equals(codeString)) return _5572009;
		if ("_5586008".equals(codeString)) return _5586008;
		if ("_5608002".equals(codeString)) return _5608002;
		if ("_5616006".equals(codeString)) return _5616006;
		if ("_5621009".equals(codeString)) return _5621009;
		if ("_5632009".equals(codeString)) return _5632009;
		if ("_5636007".equals(codeString)) return _5636007;
		if ("_5638008".equals(codeString)) return _5638008;
		if ("_5648005".equals(codeString)) return _5648005;
		if ("_5651003".equals(codeString)) return _5651003;
		if ("_5663008".equals(codeString)) return _5663008;
		if ("_5669007".equals(codeString)) return _5669007;
		if ("_5671007".equals(codeString)) return _5671007;
		if ("_5687005".equals(codeString)) return _5687005;
		if ("_5690004".equals(codeString)) return _5690004;
		if ("_5694008".equals(codeString)) return _5694008;
		if ("_5721002".equals(codeString)) return _5721002;
		if ("_5722009".equals(codeString)) return _5722009;
		if ("_5726007".equals(codeString)) return _5726007;
		if ("_5728008".equals(codeString)) return _5728008;
		if ("_5731009".equals(codeString)) return _5731009;
		if ("_5733007".equals(codeString)) return _5733007;
		if ("_5738003".equals(codeString)) return _5738003;
		if ("_5745003".equals(codeString)) return _5745003;
		if ("_5760000".equals(codeString)) return _5760000;
		if ("_5771004".equals(codeString)) return _5771004;
		if ("_5777000".equals(codeString)) return _5777000;
		if ("_5781000".equals(codeString)) return _5781000;
		if ("_5785009".equals(codeString)) return _5785009;
		if ("_5787001".equals(codeString)) return _5787001;
		if ("_5789003".equals(codeString)) return _5789003;
		if ("_5796001".equals(codeString)) return _5796001;
		if ("_5806001".equals(codeString)) return _5806001;
		if ("_5807005".equals(codeString)) return _5807005;
		if ("_5809008".equals(codeString)) return _5809008;
		if ("_5812006".equals(codeString)) return _5812006;
		if ("_5818005".equals(codeString)) return _5818005;
		if ("_5821007".equals(codeString)) return _5821007;
		if ("_5823005".equals(codeString)) return _5823005;
		if ("_5832007".equals(codeString)) return _5832007;
		if ("_5845006".equals(codeString)) return _5845006;
		if ("_5846007".equals(codeString)) return _5846007;
		if ("_5857002".equals(codeString)) return _5857002;
		if ("_5865004".equals(codeString)) return _5865004;
		if ("_5870006".equals(codeString)) return _5870006;
		if ("_5880005".equals(codeString)) return _5880005;
		if ("_5892005".equals(codeString)) return _5892005;
		if ("_5894006".equals(codeString)) return _5894006;
		if ("_5897004".equals(codeString)) return _5897004;
		if ("_5902003".equals(codeString)) return _5902003;
		if ("_5925002".equals(codeString)) return _5925002;
		if ("_5930003".equals(codeString)) return _5930003;
		if ("_5947002".equals(codeString)) return _5947002;
		if ("_5961007".equals(codeString)) return _5961007;
		if ("_5966002".equals(codeString)) return _5966002;
		if ("_5971009".equals(codeString)) return _5971009;
		if ("_5983006".equals(codeString)) return _5983006;
		if ("_5986003".equals(codeString)) return _5986003;
		if ("_5992009".equals(codeString)) return _5992009;
		if ("_5995006".equals(codeString)) return _5995006;
		if ("_5997003".equals(codeString)) return _5997003;
		if ("_5998008".equals(codeString)) return _5998008;
		if ("_6005008".equals(codeString)) return _6005008;
		if ("_6007000".equals(codeString)) return _6007000;
		if ("_6019008".equals(codeString)) return _6019008;
		if ("_6025007".equals(codeString)) return _6025007;
		if ("_6026008".equals(codeString)) return _6026008;
		if ("_6029001".equals(codeString)) return _6029001;
		if ("_6035001".equals(codeString)) return _6035001;
		if ("_6063004".equals(codeString)) return _6063004;
		if ("_6069000".equals(codeString)) return _6069000;
		if ("_6082008".equals(codeString)) return _6082008;
		if ("_6092000".equals(codeString)) return _6092000;
		if ("_6100001".equals(codeString)) return _6100001;
		if ("_6108008".equals(codeString)) return _6108008;
		if ("_6119006".equals(codeString)) return _6119006;
		if ("_6125005".equals(codeString)) return _6125005;
		if ("_6126006".equals(codeString)) return _6126006;
		if ("_6127002".equals(codeString)) return _6127002;
		if ("_6130009".equals(codeString)) return _6130009;
		if ("_6133006".equals(codeString)) return _6133006;
		if ("_6143009".equals(codeString)) return _6143009;
		if ("_6146001".equals(codeString)) return _6146001;
		if ("_6148000".equals(codeString)) return _6148000;
		if ("_6157006".equals(codeString)) return _6157006;
		if ("_6159009".equals(codeString)) return _6159009;
		if ("_6161000".equals(codeString)) return _6161000;
		if ("_6164008".equals(codeString)) return _6164008;
		if ("_6166005".equals(codeString)) return _6166005;
		if ("_6177004".equals(codeString)) return _6177004;
		if ("_6187000".equals(codeString)) return _6187000;
		if ("_6188005".equals(codeString)) return _6188005;
		if ("_6189002".equals(codeString)) return _6189002;
		if ("_6190006".equals(codeString)) return _6190006;
		if ("_6195001".equals(codeString)) return _6195001;
		if ("_6198004".equals(codeString)) return _6198004;
		if ("_6200005".equals(codeString)) return _6200005;
		if ("_6205000".equals(codeString)) return _6205000;
		if ("_6213004".equals(codeString)) return _6213004;
		if ("_6221005".equals(codeString)) return _6221005;
		if ("_6225001".equals(codeString)) return _6225001;
		if ("_6226000".equals(codeString)) return _6226000;
		if ("_6227009".equals(codeString)) return _6227009;
		if ("_6231003".equals(codeString)) return _6231003;
		if ("_6238009".equals(codeString)) return _6238009;
		if ("_6240004".equals(codeString)) return _6240004;
		if ("_6255008".equals(codeString)) return _6255008;
		if ("_6271008".equals(codeString)) return _6271008;
		if ("_6274000".equals(codeString)) return _6274000;
		if ("_6286002".equals(codeString)) return _6286002;
		if ("_6289009".equals(codeString)) return _6289009;
		if ("_6295005".equals(codeString)) return _6295005;
		if ("_6307005".equals(codeString)) return _6307005;
		if ("_6309008".equals(codeString)) return _6309008;
		if ("_6319002".equals(codeString)) return _6319002;
		if ("_6337001".equals(codeString)) return _6337001;
		if ("_6339003".equals(codeString)) return _6339003;
		if ("_6343004".equals(codeString)) return _6343004;
		if ("_6353003".equals(codeString)) return _6353003;
		if ("_6354009".equals(codeString)) return _6354009;
		if ("_6355005".equals(codeString)) return _6355005;
		if ("_6358007".equals(codeString)) return _6358007;
		if ("_6361008".equals(codeString)) return _6361008;
		if ("_6363006".equals(codeString)) return _6363006;
		if ("_6370006".equals(codeString)) return _6370006;
		if ("_6384001".equals(codeString)) return _6384001;
		if ("_6385000".equals(codeString)) return _6385000;
		if ("_6388003".equals(codeString)) return _6388003;
		if ("_6396008".equals(codeString)) return _6396008;
		if ("_6397004".equals(codeString)) return _6397004;
		if ("_6399001".equals(codeString)) return _6399001;
		if ("_6402000".equals(codeString)) return _6402000;
		if ("_6403005".equals(codeString)) return _6403005;
		if ("_6419003".equals(codeString)) return _6419003;
		if ("_6429005".equals(codeString)) return _6429005;
		if ("_6433003".equals(codeString)) return _6433003;
		if ("_6434009".equals(codeString)) return _6434009;
		if ("_6438007".equals(codeString)) return _6438007;
		if ("_6439004".equals(codeString)) return _6439004;
		if ("_6443000".equals(codeString)) return _6443000;
		if ("_6444006".equals(codeString)) return _6444006;
		if ("_6465000".equals(codeString)) return _6465000;
		if ("_6466004".equals(codeString)) return _6466004;
		if ("_6470007".equals(codeString)) return _6470007;
		if ("_6473009".equals(codeString)) return _6473009;
		if ("_6480006".equals(codeString)) return _6480006;
		if ("_6486000".equals(codeString)) return _6486000;
		if ("_6487009".equals(codeString)) return _6487009;
		if ("_6491004".equals(codeString)) return _6491004;
		if ("_6499002".equals(codeString)) return _6499002;
		if ("_6502003".equals(codeString)) return _6502003;
		if ("_6506000".equals(codeString)) return _6506000;
		if ("_6519001".equals(codeString)) return _6519001;
		if ("_6521006".equals(codeString)) return _6521006;
		if ("_6527005".equals(codeString)) return _6527005;
		if ("_6535008".equals(codeString)) return _6535008;
		if ("_6536009".equals(codeString)) return _6536009;
		if ("_6543003".equals(codeString)) return _6543003;
		if ("_6547002".equals(codeString)) return _6547002;
		if ("_6555009".equals(codeString)) return _6555009;
		if ("_6556005".equals(codeString)) return _6556005;
		if ("_6562000".equals(codeString)) return _6562000;
		if ("_6563005".equals(codeString)) return _6563005;
		if ("_6567006".equals(codeString)) return _6567006;
		if ("_6568001".equals(codeString)) return _6568001;
		if ("_6585004".equals(codeString)) return _6585004;
		if ("_6589005".equals(codeString)) return _6589005;
		if ("_6601003".equals(codeString)) return _6601003;
		if ("_6614002".equals(codeString)) return _6614002;
		if ("_6615001".equals(codeString)) return _6615001;
		if ("_6622009".equals(codeString)) return _6622009;
		if ("_6634001".equals(codeString)) return _6634001;
		if ("_6639006".equals(codeString)) return _6639006;
		if ("_6650009".equals(codeString)) return _6650009;
		if ("_6656003".equals(codeString)) return _6656003;
		if ("_6657007".equals(codeString)) return _6657007;
		if ("_6658002".equals(codeString)) return _6658002;
		if ("_6661001".equals(codeString)) return _6661001;
		if ("_6665005".equals(codeString)) return _6665005;
		if ("_6668007".equals(codeString)) return _6668007;
		if ("_6670003".equals(codeString)) return _6670003;
		throw new FHIRException("Unknown PracticeSettingCode code '" + codeString + "'");
	}
	
	/**
	 * The function maps the enum value to a string representing the code.
	 * @return the string associated with the code
	 */
	public String toCode() {
		switch (this) {
		case _104001: return "104001"; /*Excision of lesion of patella*/
		case _115006: return "115006"; /*Fit removable orthodontic appliance*/
		case _119000: return "119000"; /*Thoracoscopic partial lobectomy of lung*/
		case _121005: return "121005"; /*Retrobulbar injection of therapeutic agent*/
		case _128004: return "128004"; /*Hand microscope examination of skin*/
		case _133000: return "133000"; /*Percutaneous implantation of neurostimulator electrodes into neuromuscular component*/
		case _135007: return "135007"; /*Arthrotomy of wrist joint with exploration and biopsy*/
		case _142007: return "142007"; /*Excision of tumor from shoulder area, deep, intramuscular*/
		case _146005: return "146005"; /*Repair of nonunion of metatarsal with bone graft*/
		case _153001: return "153001"; /*Cystourethroscopy with resection of ureterocele*/
		case _160007: return "160007"; /*Removal of foreign body of tendon and/or tendon sheath*/
		case _166001: return "166001"; /*Behavioral therapy*/
		case _170009: return "170009"; /*Special potency disk identification, vancomycin test*/
		case _174000: return "174000"; /*Harrison-Richardson operation on vagina*/
		case _176003: return "176003"; /*Anastomosis of rectum*/
		case _189009: return "189009"; /*Excision of lesion of artery*/
		case _197002: return "197002"; /*Mold to yeast conversion test*/
		case _230009: return "230009"; /*Miller operation, urethrovesical suspension*/
		case _243009: return "243009"; /*Replacement of cerebral ventricular tube*/
		case _245002: return "245002"; /*Division of nerve ganglion*/
		case _262007: return "262007"; /*Percutaneous aspiration of renal pelvis*/
		case _267001: return "267001"; /*Anal fistulectomy, multiple*/
		case _285008: return "285008"; /*Incision and drainage of vulva*/
		case _294002: return "294002"; /*Excisional biopsy of joint structure of spine*/
		case _295001: return "295001"; /*Nonexcisional destruction of cyst of ciliary body*/
		case _306005: return "306005"; /*US kidneys*/
		case _316002: return "316002"; /*Partial dacryocystectomy*/
		case _334003: return "334003"; /*Panorex examination of mandible*/
		case _342002: return "342002"; /*Amobarbital interview*/
		case _346004: return "346004"; /*Periodontal scaling and root planing, per quadrant*/
		case _348003: return "348003"; /*Radionuclide dynamic function study*/
		case _351005: return "351005"; /*Urinary undiversion of ureteral anastomosis*/
		case _352003: return "352003"; /*Reagent RBC, preparation antibody sensitized pool*/
		case _353008: return "353008"; /*IV/irrigation monitoring*/
		case _374009: return "374009"; /*Costosternoplasty for pectus excavatum repair*/
		case _388008: return "388008"; /*Blepharorrhaphy*/
		case _389000: return "389000"; /*Tobramycin level*/
		case _401004: return "401004"; /*Distal subtotal pancreatectomy*/
		case _406009: return "406009"; /*Fulguration of stomach lesion*/
		case _417005: return "417005"; /*Hospital re-admission*/
		case _435001: return "435001"; /*Pulmonary inhalation study*/
		case _445004: return "445004"; /*Repair of malunion of tibia*/
		case _456004: return "456004"; /*Total abdominal colectomy with ileostomy*/
		case _459006: return "459006"; /*Closed condylotomy of mandible*/
		case _463004: return "463004"; /*Closed reduction of coxofemoral joint dislocation with splint*/
		case _468008: return "468008"; /*Glutathione measurement*/
		case _474008: return "474008"; /*Esophagoenteric anastomosis, intrathoracic*/
		case _489004: return "489004"; /*Ferritin level*/
		case _493005: return "493005"; /*Urobilinogen measurement, 48-hour, feces*/
		case _494004: return "494004"; /*Excision of lesion of tonsil*/
		case _497006: return "497006"; /*Replacement of cochlear prosthesis, multiple channels*/
		case _503003: return "503003"; /*Corneal gluing*/
		case _531007: return "531007"; /*Open pulmonary valve commissurotomy with inflow occlusion*/
		case _533005: return "533005"; /*Repair of vesicocolic fistula*/
		case _535003: return "535003"; /*Closure of ureterovesicovaginal fistula*/
		case _540006: return "540006"; /*Antibody to single and double stranded DNA measurement*/
		case _543008: return "543008"; /*Choledochostomy with transduodenal sphincteroplasty*/
		case _545001: return "545001"; /*Operative procedure on lower leg*/
		case _549007: return "549007"; /*Incision of intracranial vein*/
		case _550007: return "550007"; /*Excision of lesion of adenoids*/
		case _559008: return "559008"; /*Excision of varicose vein*/
		case _570001: return "570001"; /*Vaccination for arthropod-borne viral encephalitis*/
		case _574005: return "574005"; /*Benzodiazepine measurement*/
		case _603006: return "603006"; /*Synchondrotomy*/
		case _617002: return "617002"; /*Bone graft of mandible*/
		case _618007: return "618007"; /*Frontal sinusectomy*/
		case _625000: return "625000"; /*Removal of supernumerary digit*/
		case _628003: return "628003"; /*Steinman test*/
		case _629006: return "629006"; /*Lysis of adhesions of urethra*/
		case _633004: return "633004"; /*Chart review by physician*/
		case _637003: return "637003"; /*Lysis of adhesions of nose*/
		case _642006: return "642006"; /*Cerebral thermography*/
		case _645008: return "645008"; /*Diagnostic procedure on vitreous*/
		case _647000: return "647000"; /*Excision of cervix by electroconization*/
		case _657004: return "657004"; /*Operation on bursa*/
		case _665001: return "665001"; /*Partial meniscectomy of temporomandibular joint*/
		case _670008: return "670008"; /*Electrosurgical epilation of eyebrow*/
		case _671007: return "671007"; /*Transplantation of testis*/
		case _673005: return "673005"; /*Indirect examination of larynx*/
		case _674004: return "674004"; /*Abduction test*/
		case _676002: return "676002"; /*Peritoneal dialysis including cannulation*/
		case _680007: return "680007"; /*Radiation physics consultation*/
		case _687005: return "687005"; /*Albumin/Globulin ratio*/
		case _695009: return "695009"; /*Destructive procedure of lesion on skin of trunk*/
		case _697001: return "697001"; /*Hepatitis A virus antibody measurement*/
		case _710006: return "710006"; /*Thromboendarterectomy with graft of mesenteric artery*/
		case _712003: return "712003"; /*Closed chest suction*/
		case _721002: return "721002"; /*Medical procedure on periurethral tissue*/
		case _722009: return "722009"; /*Fine needle biopsy of thymus*/
		case _726007: return "726007"; /*Pathology consultation, comprehensive, records and specimen with report*/
		case _730005: return "730005"; /*Incision of subcutaneous tissue*/
		case _741007: return "741007"; /*Operation on prostate*/
		case _746002: return "746002"; /*Chiropractic adjustment of coccyx subluxation*/
		case _753006: return "753006"; /*Manipulation of ankle AND foot*/
		case _754000: return "754000"; /*Total urethrectomy*/
		case _759005: return "759005"; /*Intracerebral electroencephalogram*/
		case _762008: return "762008"; /*Computerized axial tomography of cervical spine with contrast*/
		case _764009: return "764009"; /*Arthrodesis of interphalangeal joint of great toe*/
		case _767002: return "767002"; /*White blood cell count - observation*/
		case _789003: return "789003"; /*Cranial decompression, subtemporal, supratentorial*/
		case _791006: return "791006"; /*Dressing and fixation procedure*/
		case _807005: return "807005"; /*Excision of brain*/
		case _814007: return "814007"; /*Electrophoresis measurement*/
		case _817000: return "817000"; /*Excision of cyst of spleen*/
		case _831000: return "831000"; /*Drawer test*/
		case _851001: return "851001"; /*Root canal therapy, molar, excluding final restoration*/
		case _853003: return "853003"; /*Fecal fat measurement, 72-hour collection*/
		case _867007: return "867007"; /*Hypoglossofacial anastomosis*/
		case _870006: return "870006"; /*Carbamazepine measurement*/
		case _879007: return "879007"; /*Special blood coagulation test, explain by report*/
		case _881009: return "881009"; /*Separation of ciliary body*/
		case _893000: return "893000"; /*Tumor antigen measurement*/
		case _897004: return "897004"; /*Radical maxillary antrotomy*/
		case _910002: return "910002"; /*MHPG measurement, urine*/
		case _911003: return "911003"; /*Removal of subarachnoid-ureteral shunt*/
		case _913000: return "913000"; /*Chiropractic patient education*/
		case _926001: return "926001"; /*Embolectomy with catheter of radial artery by arm incision*/
		case _935008: return "935008"; /*Excision of bulbourethral gland*/
		case _941001: return "941001"; /*Endoscopy of pituitary gland*/
		case _945005: return "945005"; /*Excision of tibia and fibula for graft*/
		case _948007: return "948007"; /*Phlebectomy of intracranial varicose vein*/
		case _951000: return "951000"; /*Ultrasonic guidance for endomyocardial biopsy*/
		case _956005: return "956005"; /*Anesthesia for procedure on thoracic esophagus*/
		case _967006: return "967006"; /*Drug treatment education*/
		case _969009: return "969009"; /*Incision and exploration of larynx*/
		case _971009: return "971009"; /*Prosthetic construction and fitting*/
		case _1001000: return "1001000"; /*Cauterization of Bartholin's gland*/
		case _1008006: return "1008006"; /*Operation on nerve ganglion*/
		case _1019009: return "1019009"; /*Removal of corneal epithelium*/
		case _1021004: return "1021004"; /*Repair of scrotum*/
		case _1029002: return "1029002"; /*Fetoscopy*/
		case _1032004: return "1032004"; /*Enucleation of parotid gland cyst*/
		case _1035002: return "1035002"; /*Minimum bactericidal concentration test, microdilution method*/
		case _1036001: return "1036001"; /*Insertion of intravascular device in common iliac vein, complete*/
		case _1041009: return "1041009"; /*Debridement of open fracture of phalanges of foot*/
		case _1042002: return "1042002"; /*Paternity testing*/
		case _1043007: return "1043007"; /*Doppler color flow velocity mapping*/
		case _1044001: return "1044001"; /*Diagnostic ultrasound of abdomen and retroperitoneum*/
		case _1048003: return "1048003"; /*Capillary blood sampling*/
		case _1054002: return "1054002"; /*Sphincterotomy of papilla of Vater*/
		case _1071001: return "1071001"; /*Proximal splenorenal anastomosis*/
		case _1084005: return "1084005"; /*Excision of perinephric cyst*/
		case _1093006: return "1093006"; /*Excision of abdominal varicose vein*/
		case _1103000: return "1103000"; /*Transcrural mobilization of stapes*/
		case _1104006: return "1104006"; /*Triad knee repair*/
		case _1115001: return "1115001"; /*Decortication*/
		case _1119007: return "1119007"; /*Closed reduction of dislocation of foot and toe*/
		case _1121002: return "1121002"; /*Kinetic activities for range of motion*/
		case _1127003: return "1127003"; /*Interstitial radium application*/
		case _1133007: return "1133007"; /*Removal of intact mammary implant, bilateral*/
		case _1163003: return "1163003"; /*Ureteroenterostomy*/
		case _1176009: return "1176009"; /*Incision of inguinal region*/
		case _1181000: return "1181000"; /*Excision of tendon for graft*/
		case _1186005: return "1186005"; /*Anesthesia for procedure on bony pelvis*/
		case _1198000: return "1198000"; /*Excisional biopsy of bone of scapula*/
		case _1209007: return "1209007"; /*Arthroscopic repair lateral meniscus*/
		case _1225002: return "1225002"; /*Upper arm X-ray*/
		case _1227005: return "1227005"; /*Incision of subvalvular tissue for discrete subvalvular aortic stenosis*/
		case _1235008: return "1235008"; /*Muscle transfer*/
		case _1237000: return "1237000"; /*Application of cast, sugar tong*/
		case _1238005: return "1238005"; /*Epiphyseal arrest by stapling of distal radius*/
		case _1251000: return "1251000"; /*Incisional biopsy of testis*/
		case _1253002: return "1253002"; /*Refusion of spine*/
		case _1258006: return "1258006"; /*Excision of meniscus of wrist*/
		case _1266002: return "1266002"; /*Closure of tympanic membrane perforation*/
		case _1267006: return "1267006"; /*Electrocoagulation of lesion of vagina*/
		case _1278003: return "1278003"; /*Open reduction of closed shoulder dislocation with fracture of greater tuberosity*/
		case _1279006: return "1279006"; /*Repair of cardiac pacemaker pocket in skin AND/OR subcutaneous tissue*/
		case _1292009: return "1292009"; /*MRI of bladder*/
		case _1299000: return "1299000"; /*Excision of appendiceal stump*/
		case _1315009: return "1315009"; /*Reconstruction of eyebrow*/
		case _1316005: return "1316005"; /*Upper partial denture, cast metal base without resin saddles, including any conventional clasps, rests and teeth*/
		case _1324000: return "1324000"; /*Cerebrospinal fluid immunoglobulin G ratio and immunoglobulin G index*/
		case _1327007: return "1327007"; /*Procedure on Meckel diverticulum*/
		case _1328002: return "1328002"; /*Ilioiliac shunt*/
		case _1329005: return "1329005"; /*Division of congenital web of larynx*/
		case _1337002: return "1337002"; /*Colosigmoidostomy*/
		case _1339004: return "1339004"; /*Manual evacuation of feces*/
		case _1347004: return "1347004"; /*Medical procedure on palate*/
		case _1352009: return "1352009"; /*Anterior spinal rhizotomy*/
		case _1358008: return "1358008"; /*Anti-human globulin test, enzyme technique, titer*/
		case _1366004: return "1366004"; /*Breathing treatment*/
		case _1385001: return "1385001"; /*Echography, scan B-mode for foetal age determination*/
		case _1390003: return "1390003"; /*Laparoscopic sigmoid colectomy*/
		case _1398005: return "1398005"; /*Direct thrombectomy of iliac vein by leg incision*/
		case _1399002: return "1399002"; /*Incision and exploration of ureter*/
		case _1407007: return "1407007"; /*Application of long leg cast, brace type*/
		case _1410000: return "1410000"; /*Anesthesia for tympanotomy*/
		case _1411001: return "1411001"; /*Operation on papillary muscle of heart*/
		case _1413003: return "1413003"; /*Penetrating keratoplasty with homograft*/
		case _1414009: return "1414009"; /*Angiography of arteriovenous shunt*/
		case _1417002: return "1417002"; /*Operation on face*/
		case _1431002: return "1431002"; /*pexy*/
		case _1440003: return "1440003"; /*Repair with resection-recession*/
		case _1449002: return "1449002"; /*Removal of hair*/
		case _1453000: return "1453000"; /*Biofeedback, galvanic skin response*/
		case _1455007: return "1455007"; /*Cerclage*/
		case _1457004: return "1457004"; /*Truncal vagotomy with pyloroplasty and gastrostomy*/
		case _1494008: return "1494008"; /*Osmolarity measurement*/
		case _1500007: return "1500007"; /*Bilateral epididymovasostomy*/
		case _1501006: return "1501006"; /*Altemeier operation, perineal rectal pull-through*/
		case _1505002: return "1505002"; /*Hospital admission for isolation*/
		case _1529009: return "1529009"; /*Aspiration of soft tissue*/
		case _1533002: return "1533002"; /*Ureteroplication*/
		case _1550000: return "1550000"; /*Amikacin level*/
		case _1555005: return "1555005"; /*Brief group psychotherapy*/
		case _1559004: return "1559004"; /*Interleukin (IL)-2 assay*/
		case _1576000: return "1576000"; /*Repair of intestinouterine fistula*/
		case _1577009: return "1577009"; /*Implantation of cardiac single-chamber device replacement, rate-responsive*/
		case _1578004: return "1578004"; /*Reconstruction of ossicles with stapedectomy*/
		case _1583007: return "1583007"; /*Tractotomy of mesencephalon*/
		case _1585000: return "1585000"; /*Lengthening of gastrocnemius muscle*/
		case _1596008: return "1596008"; /*Anesthesia for total elbow replacement*/
		case _1597004: return "1597004"; /*Skeletal X-ray of ankle and foot*/
		case _1602006: return "1602006"; /*Social service interview with planning*/
		case _1614003: return "1614003"; /*Bilateral repair of inguinal hernia, direct*/
		case _1615002: return "1615002"; /*Reline upper partial denture, chairside*/
		case _1616001: return "1616001"; /*Galactosylceramide beta-galactosidase measurement, leukocytes*/
		case _1636000: return "1636000"; /*Injection of sclerosing agent in varicose vein*/
		case _1638004: return "1638004"; /*Cineplasty with cineplastic prosthesis of extremity*/
		case _1640009: return "1640009"; /*History and physical examination, insurance*/
		case _1645004: return "1645004"; /*Transduodenal sphincterotomy*/
		case _1651009: return "1651009"; /*Excision of tendon sheath*/
		case _1653007: return "1653007"; /*Internal fixation of bone without fracture reduction*/
		case _1669000: return "1669000"; /*Making occupied bed*/
		case _1677001: return "1677001"; /*Haagensen test*/
		case _1678006: return "1678006"; /*Endoscopic procedure of nerve*/
		case _1680000: return "1680000"; /*Secondary chemoprophylaxis*/
		case _1683003: return "1683003"; /*Direct closure of laceration of conjunctiva*/
		case _1689004: return "1689004"; /*Local excision of ovary*/
		case _1691007: return "1691007"; /*Drainage of abscess of tonsil*/
		case _1699009: return "1699009"; /*Special dosimetry*/
		case _1702002: return "1702002"; /*Labial veneer, resin laminate, laboratory*/
		case _1704001: return "1704001"; /*Correction of tibial pseudoarthrosis*/
		case _1709006: return "1709006"; /*Breast reconstruction, bilateral, with bilateral pedicle transverse rectus abdominis myocutaneous flaps*/
		case _1712009: return "1712009"; /*Immunoglobulin typing, immunoglobulin G*/
		case _1713004: return "1713004"; /*Hypothermia, total body, induction and maintenance*/
		case _1730002: return "1730002"; /*Suture of skin wound of hindfoot*/
		case _1746005: return "1746005"; /*Buckling of sclera using implant*/
		case _1747001: return "1747001"; /*Replacement of skeletal muscle stimulator*/
		case _1753001: return "1753001"; /*Resection of uveal tissue*/
		case _1757000: return "1757000"; /*Arthroscopy of wrist with partial synovectomy*/
		case _1759002: return "1759002"; /*Assessment of nutritional status*/
		case _1770009: return "1770009"; /*Mitral valvotomy*/
		case _1774000: return "1774000"; /*Nasopharyngeal rehabilitation*/
		case _1775004: return "1775004"; /*Submaxillary incision with drainage*/
		case _1784004: return "1784004"; /*Fecal stercobilin, qualitative*/
		case _1787006: return "1787006"; /*Ultrasonic guidance for pericardiocentesis*/
		case _1788001: return "1788001"; /*Blood unit collection for directed donation, donor*/
		case _1801001: return "1801001"; /*Endoscopic biopsy of duodenum*/
		case _1805005: return "1805005"; /*Take-down of stoma*/
		case _1811008: return "1811008"; /*Aspiration of bursa of hand*/
		case _1813006: return "1813006"; /*Cryotherapy of genital warts*/
		case _1820004: return "1820004"; /*Ethanol measurement, breath*/
		case _1830008: return "1830008"; /*Open reduction of open sacral fracture*/
		case _1836002: return "1836002"; /*Excision of diverticulum of ventricle of heart*/
		case _1844002: return "1844002"; /*Plication of ligament*/
		case _1854003: return "1854003"; /*Incision of nose*/
		case _1859008: return "1859008"; /*Hand tendon foreign body removed*/
		case _1861004: return "1861004"; /*Anesthesia for closed procedure on humerus and elbow*/
		case _1862006: return "1862006"; /*Thoracic phlebectomy*/
		case _1866009: return "1866009"; /*Bilateral total nephrectomy*/
		case _1868005: return "1868005"; /*FB - Removal of foreign body from brain*/
		case _1870001: return "1870001"; /*Insertion of halo device of skull with synchronous skeletal traction*/
		case _1871002: return "1871002"; /*Repair of aneurysm of coronary artery*/
		case _1872009: return "1872009"; /*Suture of male perineum*/
		case _1876007: return "1876007"; /*Recession of prognathic jaw*/
		case _1879000: return "1879000"; /*Fluorescent antigen measurement*/
		case _1889001: return "1889001"; /*Patient transfer, in-hospital, unit-to-unit*/
		case _1906007: return "1906007"; /*Insertion of prosthesis or prosthetic device of arm, bioelectric or cineplastic*/
		case _1907003: return "1907003"; /*Bifurcation of bone*/
		case _1917008: return "1917008"; /*Patient discharge, deceased, medicolegal case*/
		case _1924009: return "1924009"; /*Hepaticotomy with drainage*/
		case _1950008: return "1950008"; /*Drainage of nasal septal abscess*/
		case _1958001: return "1958001"; /*Grafting of bone of thumb with transfer of skin flap*/
		case _1966005: return "1966005"; /*Central block anesthesia*/
		case _1983001: return "1983001"; /*Total urethrectomy including cystostomy in female*/
		case _1995001: return "1995001"; /*Stripping of cerebral meninges*/
		case _1999007: return "1999007"; /*Psychologic test*/
		case _2002009: return "2002009"; /*Construction of subcutaneous tunnel without esophageal anastomosis*/
		case _2021001: return "2021001"; /*Internal fixation of radius and ulna without fracture reduction*/
		case _2051007: return "2051007"; /*Red cell iron utilization study*/
		case _2054004: return "2054004"; /*Barbiturates measurement, quantitative and qualitative*/
		case _2067001: return "2067001"; /*Implantation of electromagnetic hearing aid*/
		case _2069003: return "2069003"; /*Dental subperiosteal implant*/
		case _2078009: return "2078009"; /*Puncture of bursa of hand*/
		case _2079001: return "2079001"; /*Reimplantation of anomalous pulmonary artery*/
		case _2080003: return "2080003"; /*Angiectomy with anastomosis of lower limb artery*/
		case _2098004: return "2098004"; /*Open reduction of open mandibular fracture with external fixation*/
		case _2115003: return "2115003"; /*Dental prophylaxis, children*/
		case _2119009: return "2119009"; /*Repair of blood vessel*/
		case _2127000: return "2127000"; /*Reduction of closed sacral fracture*/
		case _2137005: return "2137005"; /*Excision of pericardial tumor*/
		case _2153008: return "2153008"; /*Cardiac catheterization education*/
		case _2161003: return "2161003"; /*Operation on vulva*/
		case _2164006: return "2164006"; /*Injection of aorta*/
		case _2166008: return "2166008"; /*Bicuspidization of aortic valve*/
		case _2171001: return "2171001"; /*Excision of tonsil tags*/
		case _2178007: return "2178007"; /*Ureterocentesis*/
		case _2181002: return "2181002"; /*Operation for bone injury of tarsals and metatarsals*/
		case _2188008: return "2188008"; /*Suture of tendon to skeletal attachment*/
		case _2193006: return "2193006"; /*Repair of ruptured aneurysm with graft of celiac artery*/
		case _2196003: return "2196003"; /*Gas liquid chromatography, electron capture type*/
		case _2199005: return "2199005"; /*Excision of lesion of cul-de-sac*/
		case _2214008: return "2214008"; /*Curette test of skin*/
		case _2220009: return "2220009"; /*Complement component assay*/
		case _2225004: return "2225004"; /*Sensititer system test*/
		case _2234009: return "2234009"; /*Proctosigmoidopexy*/
		case _2238007: return "2238007"; /*Stone operation, anoplasty*/
		case _2242005: return "2242005"; /*Reconstruction of eyelid*/
		case _2244006: return "2244006"; /*Arthroscopy of wrist with internal fixation for instability*/
		case _2250001: return "2250001"; /*Resection of ascending aorta with anastomosis*/
		case _2252009: return "2252009"; /*Hospital admission, urgent, 48 hours*/
		case _2266004: return "2266004"; /*Venography of adrenal, bilateral*/
		case _2267008: return "2267008"; /*Replacement of tracheostomy tube*/
		case _2270007: return "2270007"; /*Correction of cleft hand*/
		case _2276001: return "2276001"; /*Exploration of popliteal artery*/
		case _2278000: return "2278000"; /*Urinalysis, automated*/
		case _2279008: return "2279008"; /*Antibody detection, red blood cell, enzyme, 1 stage technique, including anti-human globulin*/
		case _2290003: return "2290003"; /*Microbial culture, anaerobic, initial isolation*/
		case _2315006: return "2315006"; /*Brain meninges operation*/
		case _2318008: return "2318008"; /*Anesthesia for cast procedure on forearm, wrist or hand*/
		case _2321005: return "2321005"; /*Delivery by Ritgen maneuver*/
		case _2322003: return "2322003"; /*Suture of recent wound of eyelid, direct closure, full-thickness*/
		case _2337004: return "2337004"; /*Adductor tenotomy*/
		case _2344008: return "2344008"; /*Complicated cystorrhaphy*/
		case _2347001: return "2347001"; /*Diagnostic model construction*/
		case _2364003: return "2364003"; /*Radical resection of tumor of soft tissue of wrist area*/
		case _2371008: return "2371008"; /*Tympanoplasty type II with graft against incus or malleus*/
		case _2373006: return "2373006"; /*Buffy coat smear evaluation*/
		case _2382000: return "2382000"; /*Application of breast pump*/
		case _2386002: return "2386002"; /*Closed reduction of dislocation of patella*/
		case _2393003: return "2393003"; /*Ligation of vein of lower limb*/
		case _2406000: return "2406000"; /*Chart periodontal pocket*/
		case _2407009: return "2407009"; /*Excision of mediastinal tumor*/
		case _2408004: return "2408004"; /*Hexosaminidase A and total hexosaminidase measurement, serum*/
		case _2409007: return "2409007"; /*Replantation of toe*/
		case _2425002: return "2425002"; /*Epstein-Barr virus serologic test*/
		case _2442008: return "2442008"; /*Incision of lacrimal canaliculus*/
		case _2448007: return "2448007"; /*Cell count of synovial fluid with differential count*/
		case _2455009: return "2455009"; /*Revision of lumbosubarachnoid shunt*/
		case _2457001: return "2457001"; /*Blind rehabilitation*/
		case _2458006: return "2458006"; /*Educational therapy*/
		case _2459003: return "2459003"; /*Destructive procedure of artery of upper extremity*/
		case _2461007: return "2461007"; /*Tennis elbow test*/
		case _2474001: return "2474001"; /*Repair of malunion of metatarsal bones*/
		case _2475000: return "2475000"; /*Twenty-four hour collection of urine*/
		case _2480009: return "2480009"; /*Debridement of skin, subcutaneous tissue, muscle and bone*/
		case _2486003: return "2486003"; /*Destructive procedure of breast*/
		case _2488002: return "2488002"; /*Provision of contact lens*/
		case _2494005: return "2494005"; /*Nurse to nurse communication*/
		case _2498008: return "2498008"; /*Rebase of upper partial denture*/
		case _2507007: return "2507007"; /*5' Nucleotidase measurement*/
		case _2508002: return "2508002"; /*Retrograde urography with kidney-ureter-bladder*/
		case _2514009: return "2514009"; /*Manual reduction of closed supracondylar fracture of humerus with traction*/
		case _2517002: return "2517002"; /*Stroke rehabilitation*/
		case _2530001: return "2530001"; /*Chiropractic visit*/
		case _2531002: return "2531002"; /*Mononuclear cell function assay*/
		case _2535006: return "2535006"; /*Removal of pulp - complete*/
		case _2536007: return "2536007"; /*Injection of medication in anterior chamber of eye*/
		case _2547000: return "2547000"; /*Excision of keloid*/
		case _2552005: return "2552005"; /*Incision of cerebral subarachnoid space*/
		case _2564002: return "2564002"; /*Creation of lumbar shunt including laminectomy*/
		case _2566000: return "2566000"; /*Osteoplasty of radius*/
		case _2567009: return "2567009"; /*Resection of rib by transaxillary approach*/
		case _2580007: return "2580007"; /*Transplant of hair follicles to scalp*/
		case _2598006: return "2598006"; /*Open heart surgery*/
		case _2601001: return "2601001"; /*Removal of bone flap of skull*/
		case _2607002: return "2607002"; /*Operation of supporting structures of uterus*/
		case _2613006: return "2613006"; /*Implantation of joint prosthesis of hand*/
		case _2614000: return "2614000"; /*Removal of ligature from fallopian tube*/
		case _2616003: return "2616003"; /*Repair of bifid digit of hand*/
		case _2619005: return "2619005"; /*Psychiatric interpretation to family or parents of patient*/
		case _2629003: return "2629003"; /*Intracranial/cerebral perfusion pressure monitoring*/
		case _2632000: return "2632000"; /*Incision and drainage of infected bursa of upper arm*/
		case _2642003: return "2642003"; /*Prefabricated post and core in addition to crown*/
		case _2643008: return "2643008"; /*Ligation of varicose vein of head and neck*/
		case _2644002: return "2644002"; /*Cauterization of liver*/
		case _2645001: return "2645001"; /*Intelligence test/WB1*/
		case _2646000: return "2646000"; /*Incision and exploration of vas deferens*/
		case _2658000: return "2658000"; /*Social service interview of patient*/
		case _2659008: return "2659008"; /*Suture of ligament of lower extremity*/
		case _2668005: return "2668005"; /*Recementation of space maintainer*/
		case _2670001: return "2670001"; /*Diagnostic procedure on cornea*/
		case _2673004: return "2673004"; /*Incision and drainage of masticator space by extraoral approach*/
		case _2677003: return "2677003"; /*Stripping*/
		case _2690005: return "2690005"; /*MRI of pelvis*/
		case _2693007: return "2693007"; /*Stool fat, quantitative measurement*/
		case _2696004: return "2696004"; /*Hepatic venography with hemodynamic evaluation*/
		case _2697008: return "2697008"; /*Stripping and ligation of great saphenous vein*/
		case _2716009: return "2716009"; /*Dermal-fat-fascia graft*/
		case _2722000: return "2722000"; /*Interleukin-3 assay*/
		case _2731000: return "2731000"; /*Serologic test for influenza virus A*/
		case _2732007: return "2732007"; /*Recession of tendon of hand*/
		case _2737001: return "2737001"; /*Exploratory craniotomy, infratentorial*/
		case _2742009: return "2742009"; /*Destruction of Bartholin's gland*/
		case _2743004: return "2743004"; /*Operative endoscopy of ileum*/
		case _2745006: return "2745006"; /*Epiplopexy*/
		case _2752008: return "2752008"; /*Incudopexy*/
		case _2780005: return "2780005"; /*Osteoplasty of facial bones*/
		case _2794006: return "2794006"; /*Cauterization of navel*/
		case _2802005: return "2802005"; /*Manual dilation and stretching*/
		case _2811005: return "2811005"; /*Cineradiography of pharynx*/
		case _2813008: return "2813008"; /*Nephroureterocystectomy*/
		case _2837008: return "2837008"; /*Transposition of ulnar nerve at elbow*/
		case _2842000: return "2842000"; /*Gas chromatography measurement*/
		case _2843005: return "2843005"; /*Revision of urinary conduit*/
		case _2847006: return "2847006"; /*Cervical myelography*/
		case _2851008: return "2851008"; /*Arthrotomy for synovectomy of sternoclavicular joint*/
		case _2854000: return "2854000"; /*Bursectomy of hand*/
		case _2857007: return "2857007"; /*Pinealectomy*/
		case _2866006: return "2866006"; /*Obliteration of lymphatic structure*/
		case _2875008: return "2875008"; /*Implantation of joint prosthesis of elbow*/
		case _2876009: return "2876009"; /*Hospital admission, type unclassified, explain by report*/
		case _2885009: return "2885009"; /*Intradermal allergen test*/
		case _2891006: return "2891006"; /*Arthroscopy of elbow with partial synovectomy*/
		case _2898000: return "2898000"; /*Deoxyribonucleic acid analysis, antenatal, blood*/
		case _2903001: return "2903001"; /*Diagnostic procedure on anterior chamber of eye*/
		case _2908005: return "2908005"; /*Cryotherapy to hemorrhoid*/
		case _2914003: return "2914003"; /*Anterior sclerotomy*/
		case _2915002: return "2915002"; /*Suture of capsule of ankle*/
		case _2933008: return "2933008"; /*Pneumogynecography*/
		case _2945004: return "2945004"; /*Suprapubic diverticulectomy of urinary bladder*/
		case _2947007: return "2947007"; /*Therapeutic compound measurement*/
		case _2960001: return "2960001"; /*Closure of fistula of uterine cervix*/
		case _2968008: return "2968008"; /*Craniectomy with treatment of penetrating wound of brain*/
		case _2970004: return "2970004"; /*Metacarpal lengthening and transfer of local flap*/
		case _2971000: return "2971000"; /*Closure of acquired urethrovaginal fistula*/
		case _2977001: return "2977001"; /*Thrombectomy of lower limb vein*/
		case _3001009: return "3001009"; /*Total lobectomy with bronchoplasty*/
		case _3010001: return "3010001"; /*Removal of silastic tubes from ear*/
		case _3016007: return "3016007"; /*Removal of Crutchfield tongs from skull*/
		case _3025001: return "3025001"; /*Calcitonin measurement*/
		case _3026000: return "3026000"; /*Tibiotalar arthrodesis*/
		case _3029007: return "3029007"; /*Peripheral nervous system disease rehabilitation*/
		case _3041000: return "3041000"; /*Repair of stomach*/
		case _3047001: return "3047001"; /*Kowa fundus photography*/
		case _3060007: return "3060007"; /*Forequarter amputation, right*/
		case _3061006: return "3061006"; /*Complete excision of nail AND nail matrix*/
		case _3063009: return "3063009"; /*Gastroscopy through artificial stoma*/
		case _3075004: return "3075004"; /*Nonoperative removal of prosthesis of bile duct*/
		case _3078002: return "3078002"; /*Embolectomy with catheter of renal artery by abdominal incision*/
		case _3083005: return "3083005"; /*Removal of device from thorax*/
		case _3088001: return "3088001"; /*Anesthesia for endoscopic procedure on upper extremity*/
		case _3090000: return "3090000"; /*Aneurysmectomy with graft replacement of lower limb artery*/
		case _3112006: return "3112006"; /*Restraint removal*/
		case _3116009: return "3116009"; /*Clotting screening*/
		case _3130004: return "3130004"; /*Monitoring of cardiac output by electrocardiogram*/
		case _3133002: return "3133002"; /*Patient discharge, deceased, autopsy*/
		case _3137001: return "3137001"; /*Replacement*/
		case _3143004: return "3143004"; /*Visual field examination and evaluation, intermediate*/
		case _3162001: return "3162001"; /*Gadolinium measurement*/
		case _3164000: return "3164000"; /*Open reduction of closed mandibular fracture with interdental fixation*/
		case _3165004: return "3165004"; /*Irrigation of muscle of hand*/
		case _3166003: return "3166003"; /*Closure of fistula of salivary gland*/
		case _3177009: return "3177009"; /*Internal obstetrical version*/
		case _3183007: return "3183007"; /*Closure of colostomy*/
		case _3186004: return "3186004"; /*Excision of Skene gland*/
		case _3190002: return "3190002"; /*Epilation by forceps*/
		case _3204007: return "3204007"; /*Destructive procedure of nerve*/
		case _3241008: return "3241008"; /*Correction of chordee with mobilization of urethra*/
		case _3249005: return "3249005"; /*Surgical construction of filtration bleb*/
		case _3251009: return "3251009"; /*Mayo operation, herniorrhaphy*/
		case _3256004: return "3256004"; /*Cervical lymphangiogram*/
		case _3257008: return "3257008"; /*Empty and measure peritoneal dialysis fluid*/
		case _3258003: return "3258003"; /*Cerebral arteriography*/
		case _3268008: return "3268008"; /*Transplantation of tissue of pelvic region*/
		case _3270004: return "3270004"; /*Implantation of neurostimulator in spine*/
		case _3278006: return "3278006"; /*Lysis of adhesions of bursa of hand*/
		case _3287002: return "3287002"; /*Cholecystogastrostomy*/
		case _3320000: return "3320000"; /*Abt - autologous blood transfusion*/
		case _3324009: return "3324009"; /*Laser beam photocoagulation*/
		case _3326006: return "3326006"; /*Excision of exostosis of head of fifth metatarsal*/
		case _3328007: return "3328007"; /*Incision of vein of head and neck*/
		case _3333006: return "3333006"; /*Application of short arm splint, forearm to hand, static*/
		case _3338002: return "3338002"; /*Open reduction of open radial shaft fracture*/
		case _3352000: return "3352000"; /*PTH - Parathyroid hormone level*/
		case _3357006: return "3357006"; /*Iron kinetics*/
		case _3360004: return "3360004"; /*Biliary anastomosis*/
		case _3390006: return "3390006"; /*Verification procedure*/
		case _3399007: return "3399007"; /*Reduction of torsion of omentum*/
		case _3407002: return "3407002"; /*Creation of lesion of spinal cord by percutaneous method*/
		case _3413006: return "3413006"; /*Blood cell morphology*/
		case _3418002: return "3418002"; /*Chondrectomy of spine*/
		case _3432000: return "3432000"; /*Preventive dental service*/
		case _3443008: return "3443008"; /*Pulp capping*/
		case _3448004: return "3448004"; /*Fixation of contralateral testis*/
		case _3450007: return "3450007"; /*Lymphocytes, T & B cell evaluation*/
		case _3457005: return "3457005"; /*Referral procedure*/
		case _3479000: return "3479000"; /*Removal of heart assist system with replacement*/
		case _3498003: return "3498003"; /*Total excision of pituitary gland by transsphenoidal approach*/
		case _3499006: return "3499006"; /*Aspiration of vitreous with replacement*/
		case _3509001: return "3509001"; /*Streptococcus vaccination*/
		case _3512003: return "3512003"; /*Angiography of arteries of extremity*/
		case _3515001: return "3515001"; /*Replacement of electronic heart device, pulse generator*/
		case _3517009: return "3517009"; /*Removal of foreign body of pelvis from subcutaneous tissue*/
		case _3518004: return "3518004"; /*Aversive psychotherapy*/
		case _3527003: return "3527003"; /*Antibody measurement*/
		case _3546002: return "3546002"; /*CVG - Coronary vein graft*/
		case _3559005: return "3559005"; /*Insertion of ureteral stent with ureterotomy*/
		case _3562008: return "3562008"; /*Rodney Smith operation, radical subtotal pancreatectomy*/
		case _3564009: return "3564009"; /*Removal of foreign body from fallopian tube*/
		case _3575008: return "3575008"; /*Repair of fascia with graft of fascia*/
		case _3580004: return "3580004"; /*Removal of calculus of pharynx*/
		case _3605001: return "3605001"; /*Reduction of ciliary body*/
		case _3607009: return "3607009"; /*Transplantation of mesenteric tissue*/
		case _3620007: return "3620007"; /*Red cell survival study with hepatic sequestration*/
		case _3625002: return "3625002"; /*Anesthesia for brachial arteriograms, retrograde*/
		case _3651000: return "3651000"; /*Morphometric analysis, nerve*/
		case _3654008: return "3654008"; /*Excision of lingula*/
		case _3659003: return "3659003"; /*Incision of inner ear*/
		case _3664004: return "3664004"; /*Closure of scleral fistula*/
		case _3666002: return "3666002"; /*Repair of peripheral nerve by suturing*/
		case _3669009: return "3669009"; /*Fitting of prosthesis or prosthetic device of upper arm*/
		case _3673007: return "3673007"; /*Leadbetter urethral reconstruction*/
		case _3683006: return "3683006"; /*Selenium measurement, urine*/
		case _3686003: return "3686003"; /*Zancolli operation for tendon transfer of biceps*/
		case _3688002: return "3688002"; /*Anesthesia for lens surgery*/
		case _3690001: return "3690001"; /*Shunt of left subclavian to descending aorta by Blalock-Park operation*/
		case _3691002: return "3691002"; /*Wedge osteotomy of tarsals and metatarsals*/
		case _3697003: return "3697003"; /*Tissue processing technique, routine, embed, cut and stain, per autopsy*/
		case _3700004: return "3700004"; /*Erysophake extraction of lens*/
		case _3701000: return "3701000"; /*Removal of foreign body of hip from subcutaneous tissue*/
		case _3713005: return "3713005"; /*Release for de Quervain tenosynovitis of hand*/
		case _3717006: return "3717006"; /*Dilute Russell viper venom time*/
		case _3734003: return "3734003"; /*SSG - Split skin graft*/
		case _3735002: return "3735002"; /*Coproporphyrin III measurement*/
		case _3740005: return "3740005"; /*Removal of foreign body of canthus by incision*/
		case _3748003: return "3748003"; /*Biopsy of perirenal tissue*/
		case _3749006: return "3749006"; /*Reduction of closed ischial fracture*/
		case _3758004: return "3758004"; /*Thrombectomy with catheter of subclavian artery by neck incision*/
		case _3770000: return "3770000"; /*Ward urine dip stick testing*/
		case _3778007: return "3778007"; /*Scrotum manipulation*/
		case _3780001: return "3780001"; /*Routine patient disposition, no follow-up planned*/
		case _3784005: return "3784005"; /*Delayed hypersensitivity skin test for streptokinase-streptodornase*/
		case _3786007: return "3786007"; /*Excision of lesion of pharynx*/
		case _3787003: return "3787003"; /*Ultrasonic guidance for needle biopsy*/
		case _3794000: return "3794000"; /*Pregnanetriol measurement*/
		case _3796003: return "3796003"; /*Excision of redundant mucosa from jejunostomy*/
		case _3799005: return "3799005"; /*Radiography of adenoids*/
		case _3802001: return "3802001"; /*Topical application of tooth medicament - desensitizing agent*/
		case _3819004: return "3819004"; /*Embolization of thoracic artery*/
		case _3826004: return "3826004"; /*Blepharotomy with drainage of abscess of eyelid*/
		case _3828003: return "3828003"; /*Open biopsy of vertebral body of thoracic region*/
		case _3831002: return "3831002"; /*Chiropractic application of ice*/
		case _3843001: return "3843001"; /*Removal of foreign body from fascia*/
		case _3858009: return "3858009"; /*Echography of thyroid, A-mode*/
		case _3861005: return "3861005"; /*Aneurysmectomy with anastomosis of lower limb artery*/
		case _3862003: return "3862003"; /*Total vital capacity measurement*/
		case _3864002: return "3864002"; /*Excisional biopsy of scrotum*/
		case _3880007: return "3880007"; /*Excision of lesion of fibula*/
		case _3881006: return "3881006"; /*Incision and drainage of submental space by extraoral approach*/
		case _3887005: return "3887005"; /*Wart ligation*/
		case _3889008: return "3889008"; /*Suture of lip*/
		case _3891000: return "3891000"; /*Comprehensive orthodontic treatment, permanent dentition, for class I malocclusion*/
		case _3895009: return "3895009"; /*Dressing*/
		case _3907006: return "3907006"; /*Incision and drainage of retroperitoneal abscess*/
		case _3911000: return "3911000"; /*Transplantation of muscle*/
		case _3915009: return "3915009"; /*Excision of artery of thorax and abdomen*/
		case _3917001: return "3917001"; /*Excisional biopsy of phalanges of foot*/
		case _3918006: return "3918006"; /*Plastic repair with lengthening*/
		case _3926003: return "3926003"; /*Lactate measurement*/
		case _3929005: return "3929005"; /*Patient transfer, in-hospital, bed-to-bed*/
		case _3936006: return "3936006"; /*Making Foster bed*/
		case _3938007: return "3938007"; /*Cerclage for retinal reattachment*/
		case _3942005: return "3942005"; /*Cystopexy*/
		case _3955006: return "3955006"; /*Antibody elution from red blood cells*/
		case _3957003: return "3957003"; /*Arteriectomy of thoracoabdominal aorta*/
		case _3963007: return "3963007"; /*Operation on submaxillary gland*/
		case _3967008: return "3967008"; /*Fluorescence polarization immunoassay*/
		case _3968003: return "3968003"; /*Excision of spinal facet joint*/
		case _3969006: return "3969006"; /*Removal of osteocartilagenous loose body from joint structures*/
		case _3971006: return "3971006"; /*Duchenne muscular dystrophy carrier detection*/
		case _3980006: return "3980006"; /*Partial excision of esophagus*/
		case _3981005: return "3981005"; /*Carrier detection, molecular genetics*/
		case _3985001: return "3985001"; /*Anesthesia for procedure on arteries of lower leg with bypass graft*/
		case _3991004: return "3991004"; /*MRI of pelvis, prostate and bladder*/
		case _3998005: return "3998005"; /*Bone imaging of limited area*/
		case _4007002: return "4007002"; /*Anti-human globulin test, indirect, titer, non-gamma*/
		case _4008007: return "4008007"; /*Phlebography of neck*/
		case _4010009: return "4010009"; /*Oophorectomy of remaining ovary with tube*/
		case _4027001: return "4027001"; /*Implantation of electronic stimulator into phrenic nerve*/
		case _4034004: return "4034004"; /*Closed reduction of facial fracture, except mandible*/
		case _4035003: return "4035003"; /*Restoration, resin, two surfaces, posterior, permanent*/
		case _4036002: return "4036002"; /*Arthroscopy of elbow with extensive debridement*/
		case _4037006: return "4037006"; /*Removal of vascular graft or prosthesis*/
		case _4044002: return "4044002"; /*Construction of permanent colostomy*/
		case _4045001: return "4045001"; /*Drainage of cerebral ventricle by incision*/
		case _4052004: return "4052004"; /*Percutaneous aspiration of spinal cord cyst*/
		case _4064007: return "4064007"; /*Specimen aliquoting*/
		case _4068005: return "4068005"; /*Removal of ventricular reservoir with synchronous replacement*/
		case _4083000: return "4083000"; /*Fitting of prosthesis or prosthetic device of lower arm*/
		case _4084006: return "4084006"; /*Repair of tendon of hand by graft or implant of muscle*/
		case _4090005: return "4090005"; /*Replacement of transvenous atrial and ventricular pacemaker electrode leads*/
		case _4094001: return "4094001"; /*Reduction of retroversion of uterus by suppository*/
		case _4101004: return "4101004"; /*Revision of spinal pleurothecal shunt*/
		case _4102006: return "4102006"; /*Root canal therapy, anterior, excluding final restoration*/
		case _4114003: return "4114003"; /*Parenteral chemotherapy for malignant neoplasm*/
		case _4116001: return "4116001"; /*Construction of window*/
		case _4119008: return "4119008"; /*Intracranial phlebectomy with anastomosis*/
		case _4131005: return "4131005"; /*Implantation into pelvic region*/
		case _4134002: return "4134002"; /*Operative block anesthesia*/
		case _4139007: return "4139007"; /*Posterior spinal cordotomy*/
		case _4143006: return "4143006"; /*Injection into anterior chamber of eye*/
		case _4149005: return "4149005"; /*Bone histomorphometry, aluminum stain*/
		case _4154001: return "4154001"; /*Incision and drainage of penis*/
		case _4165006: return "4165006"; /*Delayed hypersensitivity skin test for staphage lysate*/
		case _4176005: return "4176005"; /*Fothergill repair*/
		case _4192000: return "4192000"; /*Toxicology testing for organophosphate insecticide*/
		case _4213001: return "4213001"; /*Implantation of Ommaya reservoir*/
		case _4214007: return "4214007"; /*Intracardiac injection for cardiac resuscitation*/
		case _4226002: return "4226002"; /*Excision of lesion of thoracic vein*/
		case _4252008: return "4252008"; /*Aneurysmectomy with graft replacement by interposition*/
		case _4263006: return "4263006"; /*Biopsy of soft tissue of elbow area, superficial*/
		case _4266003: return "4266003"; /*Patient referral for drug addiction rehabilitation*/
		case _4285000: return "4285000"; /*Insertion of bone growth stimulator into femur*/
		case _4293000: return "4293000"; /*Reduction of intussusception by laparotomy*/
		case _4304000: return "4304000"; /*Excision of cusp of tricuspid valve*/
		case _4319004: return "4319004"; /*Rebase of complete lower denture*/
		case _4321009: return "4321009"; /*Bilateral leg arteriogram*/
		case _4323007: return "4323007"; /*Destruction of lesion of sclera*/
		case _4331002: return "4331002"; /*Anesthesia for hernia repair in lower abdomen*/
		case _4333004: return "4333004"; /*Incision and drainage of perisplenic space*/
		case _4336007: return "4336007"; /*Lloyd-Davies operation, abdominoperineal resection*/
		case _4337003: return "4337003"; /*Homogentisic acid measurement*/
		case _4339000: return "4339000"; /*Repair of nasolabial fistula*/
		case _4341004: return "4341004"; /*Complete submucous resection of turbinate*/
		case _4344007: return "4344007"; /*Cryopexy*/
		case _4348005: return "4348005"; /*Musculoplasty of hand*/
		case _4350002: return "4350002"; /*Removal of implant of cornea*/
		case _4363008: return "4363008"; /*Endoscopic brush biopsy of trachea*/
		case _4365001: return "4365001"; /*Surgical repair*/
		case _4380007: return "4380007"; /*Transposition of vulvar tissue*/
		case _4387005: return "4387005"; /*Valvuloplasty of pulmonary valve in total repair of tetralogy of Fallot*/
		case _4388000: return "4388000"; /*Repair of splenocolic fistula*/
		case _4407008: return "4407008"; /*Slitting of lacrimal canaliculus for passage of tube*/
		case _4411002: return "4411002"; /*Removal of device from female genital tract*/
		case _4420006: return "4420006"; /*Incision and drainage of parapharyngeal abscess by external approach*/
		case _4424002: return "4424002"; /*Making orthopedic bed*/
		case _4436008: return "4436008"; /*Methylatable chemotaxis protein (MCP) receptor measurement*/
		case _4438009: return "4438009"; /*Venography of vena cava*/
		case _4443002: return "4443002"; /*Decortication of ovary*/
		case _4447001: return "4447001"; /*Autopsy, gross and microscopic examination, stillborn or newborn without central nervous system*/
		case _4449003: return "4449003"; /*Manipulation of spinal meninges*/
		case _4450003: return "4450003"; /*Application of Kirschner wire*/
		case _4455008: return "4455008"; /*Open reduction of open elbow dislocation*/
		case _4457000: return "4457000"; /*Insertion of mold into vagina*/
		case _4466001: return "4466001"; /*Exploration of upper limb artery*/
		case _4467005: return "4467005"; /*Excision of tumor of ankle area, deep, intramuscular*/
		case _4475004: return "4475004"; /*Cyanide level*/
		case _4487006: return "4487006"; /*Norepinephrine measurement, supine*/
		case _4489009: return "4489009"; /*Neurolysis of trigeminal nerve*/
		case _4496006: return "4496006"; /*Mouthcare procedure*/
		case _4503005: return "4503005"; /*Removal of foreign body of sclera without use of magnet*/
		case _4504004: return "4504004"; /*Potter obstetrical version with extraction*/
		case _4505003: return "4505003"; /*Tenolysis of flexor tendon of forearm*/
		case _4507006: return "4507006"; /*Decompression fasciotomy of wrist, flexor and extensor compartment*/
		case _4511000: return "4511000"; /*Restoration, inlay, composite/resin, one surface, laboratory processed*/
		case _4516005: return "4516005"; /*Iridencleisis and iridotasis*/
		case _4520009: return "4520009"; /*Anastomosis of esophagus, antesternal or antethoracic, with insertion of prosthesis*/
		case _4525004: return "4525004"; /*Seen by casualty - service*/
		case _4533003: return "4533003"; /*Ligation of artery of lower limb*/
		case _4535005: return "4535005"; /*Incision of pelvirectal tissue*/
		case _4539004: return "4539004"; /*Excision of cyst of bronchus*/
		case _4542005: return "4542005"; /*Closed reduction of fracture of foot*/
		case _4544006: return "4544006"; /*Excision of subcutaneous tumor of extremities*/
		case _4558008: return "4558008"; /*Anterior resection of rectum*/
		case _4563007: return "4563007"; /*Hospital admission, transfer from other hospital or health care facility*/
		case _4570007: return "4570007"; /*Chemopallidectomy*/
		case _4579008: return "4579008"; /*Creation of ventriculoatrial shunt*/
		case _4581005: return "4581005"; /*Coreoplasty*/
		case _4585001: return "4585001"; /*Decompression of tendon of hand*/
		case _4587009: return "4587009"; /*Epiphysiodesis of distal radius*/
		case _4589007: return "4589007"; /*Care relating to reproduction and pregnancy*/
		case _4593001: return "4593001"; /*Cauterization of sclera with iridectomy*/
		case _4594007: return "4594007"; /*Coproporphyrin isomers, series I & III, urine*/
		case _4613005: return "4613005"; /*Radioimmunoassay*/
		case _4625008: return "4625008"; /*Apical pulse taking*/
		case _4626009: return "4626009"; /*Take-down of arterial anastomosis*/
		case _4636001: return "4636001"; /*Denker operation for radical maxillary antrotomy*/
		case _4640005: return "4640005"; /*Ligation of fallopian tubes by abdominal approach*/
		case _4642002: return "4642002"; /*Removal of inflatable penile prosthesis, with pump, reservoir and cylinders*/
		case _4660002: return "4660002"; /*Diagnostic procedure on phalanges of foot*/
		case _4670000: return "4670000"; /*Catheterization of bronchus*/
		case _4671001: return "4671001"; /*Excision of lesion from sphenoid sinus*/
		case _4672008: return "4672008"; /*Medical procedure on the nervous system*/
		case _4691008: return "4691008"; /*Identification of rotavirus antigen in feces*/
		case _4692001: return "4692001"; /*Transplantation of artery of upper extremity*/
		case _4694000: return "4694000"; /*Percutaneous biopsy of muscle*/
		case _4699005: return "4699005"; /*Alpha naphthyl butyrate stain method, blood or bone marrow*/
		case _4701005: return "4701005"; /*Colony forming unit-granulocyte-monocyte-erythroid-megakaryocyte assay*/
		case _4707009: return "4707009"; /*Partial excision of calcaneus*/
		case _4712005: return "4712005"; /*Removal of Gardner Wells tongs from skull*/
		case _4713000: return "4713000"; /*Endoscopy and photography*/
		case _4719001: return "4719001"; /*Psychologic cognitive testing and assessment*/
		case _4727005: return "4727005"; /*Lipoprotein electrophoresis*/
		case _4734007: return "4734007"; /*Irrigation of wound catheter of integument*/
		case _4737000: return "4737000"; /*Mycobacteria culture*/
		case _4756005: return "4756005"; /*Cryotherapy of subcutaneous tissue*/
		case _4758006: return "4758006"; /*Incudostapediopexy*/
		case _4764004: return "4764004"; /*Jet ventilation procedure*/
		case _4765003: return "4765003"; /*Insertion of ocular implant following or secondary to enucleation*/
		case _4770005: return "4770005"; /*Colporrhaphy for repair of urethrocele*/
		case _4772002: return "4772002"; /*Reduction of torsion of spermatic cord*/
		case _4784000: return "4784000"; /*Operation on sublingual gland*/
		case _4804005: return "4804005"; /*Microbial identification test*/
		case _4811009: return "4811009"; /*Reconstruction of diaphragm*/
		case _4815000: return "4815000"; /*Antibody identification, red blood cell antibody panel, enzyme, 2 stage technique including anti-human globulin*/
		case _4820000: return "4820000"; /*Incision of labial frenum*/
		case _4827002: return "4827002"; /*Shower hydrotherapy*/
		case _4829004: return "4829004"; /*Excision of small intestine for interposition*/
		case _4847005: return "4847005"; /*Anesthesia for cesarean section*/
		case _4849008: return "4849008"; /*Ovarian biopsy*/
		case _4862007: return "4862007"; /*Revision of anastomosis of large intestine*/
		case _4877004: return "4877004"; /*Extracapsular extraction of lens with iridectomy*/
		case _4891005: return "4891005"; /*Proctostomy*/
		case _4895001: return "4895001"; /*Construction of sigmoid bladder*/
		case _4902005: return "4902005"; /*Ethchlorvynol measurement*/
		case _4903000: return "4903000"; /*Serum protein electrophoresis*/
		case _4904006: return "4904006"; /*Dilation of anal sphincter under nonlocal anesthesia*/
		case _4914002: return "4914002"; /*Treatment planning for teletherapy*/
		case _4929000: return "4929000"; /*Local perfusion of kidney*/
		case _4930005: return "4930005"; /*Repair of thoracogastric fistula*/
		case _4934001: return "4934001"; /*Salpingography*/
		case _4957007: return "4957007"; /*Cervical spinal fusion for pseudoarthrosis*/
		case _4966006: return "4966006"; /*Extracorporeal perfusion*/
		case _4970003: return "4970003"; /*Venography*/
		case _4974007: return "4974007"; /*Liver operation*/
		case _4976009: return "4976009"; /*Anesthesia for endoscopic procedure on lower extremity*/
		case _4987001: return "4987001"; /*Osteoplasty of cranium with flap of bone*/
		case _4992004: return "4992004"; /*Cardiac catheterization, left heart, retrograde, percutaneous*/
		case _4993009: return "4993009"; /*Ischemic limb exercise with electromyography and lactic acid determination*/
		case _5016005: return "5016005"; /*Pontic, resin with high noble metal*/
		case _5019003: return "5019003"; /*Direct laryngoscopy with biopsy*/
		case _5021008: return "5021008"; /*Aldosterone measurement, standing, normal salt diet*/
		case _5022001: return "5022001"; /*Lysergic acid diethylamide measurement*/
		case _5025004: return "5025004"; /*Semen analysis, presence and motility of sperm*/
		case _5032008: return "5032008"; /*Labial veneer, porcelain laminate, laboratory*/
		case _5034009: return "5034009"; /*Graft to hair-bearing skin*/
		case _5048009: return "5048009"; /*External cephalic version with tocolysis*/
		case _5055006: return "5055006"; /*Uniscept system test*/
		case _5057003: return "5057003"; /*Radical orbitomaxillectomy*/
		case _5065000: return "5065000"; /*Reduction of closed traumatic hip dislocation with anesthesia*/
		case _5091004: return "5091004"; /*Peripheral vascular disease study*/
		case _5105000: return "5105000"; /*Endoscopy of renal pelvis*/
		case _5110001: return "5110001"; /*Ultrasound peripheral imaging, real time scan*/
		case _5113004: return "5113004"; /*FT4 - Free thyroxine level*/
		case _5119000: return "5119000"; /*Epiglottidectomy*/
		case _5121005: return "5121005"; /*Wedge osteotomy of pelvic bone*/
		case _5123008: return "5123008"; /*Anesthesia for procedure on pericardium with pump oxygenator*/
		case _5130002: return "5130002"; /*Needling of lens for cataract*/
		case _5131003: return "5131003"; /*Radiography of chest wall*/
		case _5135007: return "5135007"; /*Diagnostic procedure on scapula*/
		case _5147001: return "5147001"; /*Excision of lesion of ankle joint*/
		case _5151004: return "5151004"; /*Manual reduction of rectal hemorrhoids*/
		case _5154007: return "5154007"; /*Communication enhancement: speech deficit*/
		case _5161006: return "5161006"; /*Specialty clinic admission*/
		case _5162004: return "5162004"; /*Excision of pressure ulcer*/
		case _5165002: return "5165002"; /*Division of thoracic artery*/
		case _5176003: return "5176003"; /*Thromboendarterectomy with graft of renal artery*/
		case _5182000: return "5182000"; /*Total body perfusion*/
		case _5184004: return "5184004"; /*Osteotomy of shaft of femur with fixation*/
		case _5186002: return "5186002"; /*Arthrotomy for synovectomy of glenohumeral joint*/
		case _5190000: return "5190000"; /*Cell fusion*/
		case _5191001: return "5191001"; /*Surgical treatment of missed miscarriage of second trimester*/
		case _5212002: return "5212002"; /*Excision of lesion of lacrimal gland by frontal approach*/
		case _5216004: return "5216004"; /*Three dimensional ultrasound imaging of heart*/
		case _5233006: return "5233006"; /*Lateral fasciotomy*/
		case _5243009: return "5243009"; /*Suture of adenoid fossa*/
		case _5245002: return "5245002"; /*Transplantation of peripheral vein*/
		case _5246001: return "5246001"; /*Breakpoint cluster region analysis*/
		case _5264008: return "5264008"; /*Total bile acids measurement*/
		case _5267001: return "5267001"; /*Adrenal artery ligation*/
		case _5270002: return "5270002"; /*Bilateral destruction of fallopian tubes*/
		case _5273000: return "5273000"; /*Manual reduction of closed fracture of proximal end of ulna*/
		case _5282006: return "5282006"; /*Operation on oropharynx*/
		case _5290006: return "5290006"; /*Incision and drainage of Ludwig angina*/
		case _5298004: return "5298004"; /*Incision and drainage of deep hematoma of thigh region*/
		case _5304008: return "5304008"; /*DXT - Radiotherapy*/
		case _5316002: return "5316002"; /*Closed osteotomy of mandibular ramus*/
		case _5317006: return "5317006"; /*Radical amputation of penis with bilateral pelvic lymphadenectomy*/
		case _5326009: return "5326009"; /*Administration of dermatologic formulation*/
		case _5328005: return "5328005"; /*Shortening of Achilles tendon*/
		case _5337005: return "5337005"; /*Trocar biopsy*/
		case _5338000: return "5338000"; /*Nicotine measurement*/
		case _5342002: return "5342002"; /*Prophylactic treatment of tibia with methyl methacrylate*/
		case _5348003: return "5348003"; /*Repair of endocardial cushion defect*/
		case _5357009: return "5357009"; /*Leukocyte poor blood preparation*/
		case _5373003: return "5373003"; /*Stress breaker*/
		case _5384005: return "5384005"; /*Excision of part of frontal cortex*/
		case _5391008: return "5391008"; /*Artificial voice rehabilitation*/
		case _5393006: return "5393006"; /*Exploration of parathyroid with mediastinal exploration by sternal split approach*/
		case _5402006: return "5402006"; /*Manipulation of thoracic artery*/
		case _5407000: return "5407000"; /*Injection of fallopian tube*/
		case _5415002: return "5415002"; /*Destruction of lesion of liver*/
		case _5419008: return "5419008"; /*Lysis of adhesions of tendon of hand*/
		case _5422005: return "5422005"; /*Amylase measurement, peritoneal fluid*/
		case _5429001: return "5429001"; /*Diagnostic procedure on nipple*/
		case _5431005: return "5431005"; /*Percutaneous transluminal angioplasty*/
		case _5433008: return "5433008"; /*Skeletal X-ray of lower limb*/
		case _5446003: return "5446003"; /*Excision of cervical rib for outlet compression syndrome with sympathectomy*/
		case _5447007: return "5447007"; /*Transfusion*/
		case _5452002: return "5452002"; /*Core needle biopsy of thymus*/
		case _5456004: return "5456004"; /*Graft of lymphatic structure*/
		case _5457008: return "5457008"; /*Serologic test for Rickettsia conorii*/
		case _5460001: return "5460001"; /*Removal of prosthesis from fallopian tube*/
		case _5479003: return "5479003"; /*Select picture audiometry*/
		case _5482008: return "5482008"; /*Serologic test for Blastomyces*/
		case _5486006: return "5486006"; /*Delayed suture of tendon of hand*/
		case _5489004: return "5489004"; /*Diagnostic procedure on radius*/
		case _5506006: return "5506006"; /*Incision and exploration of abdominal wall*/
		case _5517007: return "5517007"; /*Restoration, inlay, porcelain/ceramic, per tooth, in addition to inlay*/
		case _5521000: return "5521000"; /*Open reduction of fracture of phalanges of foot*/
		case _5536002: return "5536002"; /*Arthrodesis of carpometacarpal joint of digits, other than thumb*/
		case _5545001: return "5545001"; /*Repair of carotid body*/
		case _5551006: return "5551006"; /*Direct laryngoscopy with arytenoidectomy with operating microscope*/
		case _5556001: return "5556001"; /*Manually assisted spontaneous delivery*/
		case _5570001: return "5570001"; /*Arthrotomy for infection with exploration and drainage of carpometacarpal joint*/
		case _5571002: return "5571002"; /*Excision of lesion of aorta with end-to-end anastomosis*/
		case _5572009: return "5572009"; /*Incision of kidney pelvis*/
		case _5586008: return "5586008"; /*Aminolevulinic acid dehydratase measurement*/
		case _5608002: return "5608002"; /*Excretion measurement*/
		case _5616006: return "5616006"; /*Osteoplasty of tibia*/
		case _5621009: return "5621009"; /*Excision of malignant lesion of skin of extremities*/
		case _5632009: return "5632009"; /*Open biopsy of bronchus*/
		case _5636007: return "5636007"; /*Fistulectomy of bone*/
		case _5638008: return "5638008"; /*Carbohydrate measurement*/
		case _5648005: return "5648005"; /*Surgical repair and revision of shunt*/
		case _5651003: return "5651003"; /*Arylsulfatase A measurement*/
		case _5663008: return "5663008"; /*Phlebectomy of varicose vein of head and neck*/
		case _5669007: return "5669007"; /*Portable electroencephalogram awake and asleep with stimulation*/
		case _5671007: return "5671007"; /*Magnet extraction of foreign body from ciliary body*/
		case _5687005: return "5687005"; /*Removal of foreign body from ovary*/
		case _5690004: return "5690004"; /*Incision of seminal vesicle*/
		case _5694008: return "5694008"; /*Crisis intervention with follow-up*/
		case _5721002: return "5721002"; /*Repair of eyebrow*/
		case _5722009: return "5722009"; /*Surgical reanastomosis of colon*/
		case _5726007: return "5726007"; /*Removal of epicardial electrodes*/
		case _5728008: return "5728008"; /*Anoscopy for removal of foreign body*/
		case _5731009: return "5731009"; /*Hemosiderin, quantitative measurement*/
		case _5733007: return "5733007"; /*Fluorescent identification of anti-nuclear antibody*/
		case _5738003: return "5738003"; /*Biopsy of cul-de-sac*/
		case _5745003: return "5745003"; /*Excision ampulla of Vater with reimplantation of common duct*/
		case _5760000: return "5760000"; /*Osteoplasty of radius and ulna, shortening*/
		case _5771004: return "5771004"; /*Blepharotomy*/
		case _5777000: return "5777000"; /*Flexorplasty of elbow*/
		case _5781000: return "5781000"; /*Operation on nasal septum*/
		case _5785009: return "5785009"; /*Forensic autopsy*/
		case _5787001: return "5787001"; /*Elevation of bone fragments of orbit of skull with debridement*/
		case _5789003: return "5789003"; /*Lysis of adhesions of intestines*/
		case _5796001: return "5796001"; /*Excision of external thrombotic hemorrhoid*/
		case _5806001: return "5806001"; /*Revision of tracheostomy scar*/
		case _5807005: return "5807005"; /*Fenestration of inner ear, initial*/
		case _5809008: return "5809008"; /*Selective vagotomy with pyloroplasty and gastrostomy*/
		case _5812006: return "5812006"; /*Laboratory reporting, fax*/
		case _5818005: return "5818005"; /*Flocculation test*/
		case _5821007: return "5821007"; /*Ligation, division and complete stripping of long and short saphenous veins*/
		case _5823005: return "5823005"; /*Diagnostic radiography, left*/
		case _5832007: return "5832007"; /*Partial ostectomy of thorax, ribs or sternum*/
		case _5845006: return "5845006"; /*Emulsification procedure*/
		case _5846007: return "5846007"; /*Diagnostic radiography of toes*/
		case _5857002: return "5857002"; /*Complement mediated cytotoxicity assay*/
		case _5865004: return "5865004"; /*Open reduction of dislocation of toe*/
		case _5870006: return "5870006"; /*Tertiary closure of abdominal wall*/
		case _5880005: return "5880005"; /*Clinical examination*/
		case _5892005: return "5892005"; /*Mastoid antrotomy*/
		case _5894006: return "5894006"; /*Methyl red test*/
		case _5897004: return "5897004"; /*Removal of Scribner shunt*/
		case _5902003: return "5902003"; /*History and physical examination, complete*/
		case _5925002: return "5925002"; /*Incision and drainage of hematoma of wrist*/
		case _5930003: return "5930003"; /*Cardiac monitor removal*/
		case _5947002: return "5947002"; /*Consultation for hearing and/or speech problem*/
		case _5961007: return "5961007"; /*Division of blood vessels of cornea*/
		case _5966002: return "5966002"; /*Removal of foreign body from elbow area, deep*/
		case _5971009: return "5971009"; /*Incision and drainage of axilla*/
		case _5983006: return "5983006"; /*Repair of spermatic cord*/
		case _5986003: return "5986003"; /*Non-sensitized spontaneous sheep erythrocyte binding, E-rosette*/
		case _5992009: return "5992009"; /*Midtarsal arthrodesis, multiple*/
		case _5995006: return "5995006"; /*Gas liquid chromatography, flame photometric type*/
		case _5997003: return "5997003"; /*Drainage of cerebral subarachnoid space by aspiration*/
		case _5998008: return "5998008"; /*Radical dissection of groin*/
		case _6005008: return "6005008"; /*Transplantation of vitreous by anterior approach*/
		case _6007000: return "6007000"; /*Magnetic resonance imaging of chest*/
		case _6019008: return "6019008"; /*Endoscopy of large intestine*/
		case _6025007: return "6025007"; /*Laparoscopic appendectomy*/
		case _6026008: return "6026008"; /*Removal of coronary artery obstruction by percutaneous transluminal balloon with thrombolytic agent*/
		case _6029001: return "6029001"; /*Augmentation of outflow tract of pulmonary valve*/
		case _6035001: return "6035001"; /*Chart abstracting*/
		case _6063004: return "6063004"; /*Kanamycin measurement*/
		case _6069000: return "6069000"; /*Panniculotomy*/
		case _6082008: return "6082008"; /*Perforation of footplate*/
		case _6092000: return "6092000"; /*Aspiration of nasal sinus by puncture*/
		case _6100001: return "6100001"; /*Fenestration of stapes footplate with vein graft*/
		case _6108008: return "6108008"; /*Subdural tap through fontanel, infant, initial*/
		case _6119006: return "6119006"; /*Local destruction of lesion of bony palate*/
		case _6125005: return "6125005"; /*Change of gastrostomy tube*/
		case _6126006: return "6126006"; /*Fitzgerald factor assay*/
		case _6127002: return "6127002"; /*Diagnostic radiography of abdomen, oblique standard*/
		case _6130009: return "6130009"; /*Surgical exposure of impacted or unerupted tooth to aid eruption*/
		case _6133006: return "6133006"; /*Lymphokine assay*/
		case _6143009: return "6143009"; /*Diabetic education*/
		case _6146001: return "6146001"; /*Repair of heart septum with prosthesis*/
		case _6148000: return "6148000"; /*Chondrectomy of semilunar cartilage of knee*/
		case _6157006: return "6157006"; /*Endoscopic retrograde cholangiopancreatography with biopsy*/
		case _6159009: return "6159009"; /*Galactose measurement*/
		case _6161000: return "6161000"; /*Excision of lesion of capsule of toes*/
		case _6164008: return "6164008"; /*Osteoclasis of clavicle*/
		case _6166005: return "6166005"; /*Nephropyeloureterostomy*/
		case _6177004: return "6177004"; /*Southern blot assay*/
		case _6187000: return "6187000"; /*Repair of aneurysm with graft of common femoral artery*/
		case _6188005: return "6188005"; /*Arthrotomy of knee*/
		case _6189002: return "6189002"; /*Excision of aberrant tissue of breast*/
		case _6190006: return "6190006"; /*Colopexy*/
		case _6195001: return "6195001"; /*Transurethral drainage of prostatic abscess*/
		case _6198004: return "6198004"; /*Repair of fracture with Sofield type procedure*/
		case _6200005: return "6200005"; /*Excision of lesion of female perineum*/
		case _6205000: return "6205000"; /*Fluorescent antigen, titer*/
		case _6213004: return "6213004"; /*Prescribing corneoscleral contact lens*/
		case _6221005: return "6221005"; /*Suture of colon*/
		case _6225001: return "6225001"; /*Antibody detection, RBC, enzyme, 2 stage technique, including anti-human globulin*/
		case _6226000: return "6226000"; /*Visual rehabilitation, eye motion defect*/
		case _6227009: return "6227009"; /*Relationship psychotherapy*/
		case _6231003: return "6231003"; /*Graft of palate*/
		case _6238009: return "6238009"; /*Diagnostic radiography of sacroiliac joints*/
		case _6240004: return "6240004"; /*Operative procedure on knee*/
		case _6255008: return "6255008"; /*Resection of abdominal artery with replacement*/
		case _6271008: return "6271008"; /*Echography, immersion B-scan*/
		case _6274000: return "6274000"; /*Excision of aural glomus tumor, extended, extratemporal*/
		case _6286002: return "6286002"; /*Destructive procedure on ovaries and fallopian tubes*/
		case _6289009: return "6289009"; /*White blood cell histogram evaluation*/
		case _6295005: return "6295005"; /*Sequestrectomy of pelvic bone*/
		case _6307005: return "6307005"; /*Keratophakia*/
		case _6309008: return "6309008"; /*Fecal fat differential, quantitative*/
		case _6319002: return "6319002"; /*Beta lactamase, chromogenic cephalosporin susceptibility test*/
		case _6337001: return "6337001"; /*Ligation of aortic arch*/
		case _6339003: return "6339003"; /*Conditioning play audiometry*/
		case _6343004: return "6343004"; /*Forensic bite mark comparison technique*/
		case _6353003: return "6353003"; /*Mitsuda reaction to lepromin*/
		case _6354009: return "6354009"; /*Sedimentation rate, Westergren*/
		case _6355005: return "6355005"; /*Removal of internal fixation device of radius*/
		case _6358007: return "6358007"; /*Capsulorrhaphy of joint*/
		case _6361008: return "6361008"; /*Anesthesia for popliteal thromboendarterectomy*/
		case _6363006: return "6363006"; /*Dilation of lacrimal punctum with irrigation*/
		case _6370006: return "6370006"; /*Chemosurgery of stomach lesion*/
		case _6384001: return "6384001"; /*Removal of device from digestive system*/
		case _6385000: return "6385000"; /*Exploration of disc space*/
		case _6388003: return "6388003"; /*TdT stain*/
		case _6396008: return "6396008"; /*Galactokinase measurement*/
		case _6397004: return "6397004"; /*Muscular strength development exercise*/
		case _6399001: return "6399001"; /*Division of arteriovenous fistula with ligation*/
		case _6402000: return "6402000"; /*Excision of common bile duct*/
		case _6403005: return "6403005"; /*Lengthening of muscle of hand*/
		case _6419003: return "6419003"; /*Excision of tumor from elbow area, deep, subfascial*/
		case _6429005: return "6429005"; /*Heteroautogenous transplantation*/
		case _6433003: return "6433003"; /*Closed heart valvotomy of mitral valve*/
		case _6434009: return "6434009"; /*Seminal fluid detection*/
		case _6438007: return "6438007"; /*Exploration of ciliary body*/
		case _6439004: return "6439004"; /*Destruction of lesion of peripheral nerve*/
		case _6443000: return "6443000"; /*Pontic, porcelain fused to predominantly base metal*/
		case _6444006: return "6444006"; /*Enlargement of eye socket*/
		case _6465000: return "6465000"; /*Arthrotomy of glenohumeral joint for infection with drainage*/
		case _6466004: return "6466004"; /*Administration of Rh immune globulin*/
		case _6470007: return "6470007"; /*Laparoamnioscopy*/
		case _6473009: return "6473009"; /*Suture of old obstetrical laceration of uterus*/
		case _6480006: return "6480006"; /*Urinary bladder residual urine study*/
		case _6486000: return "6486000"; /*Curettage of sclera*/
		case _6487009: return "6487009"; /*Hand tendon pulley reconstruction with tendon prosthesis*/
		case _6491004: return "6491004"; /*Protein S, free assay*/
		case _6499002: return "6499002"; /*Tsuge operation on finger for macrodactyly repair*/
		case _6502003: return "6502003"; /*Complete lower denture*/
		case _6506000: return "6506000"; /*Placing a patient on a bedpan*/
		case _6519001: return "6519001"; /*Operation on multiple extraocular muscles with temporary detachment from globe*/
		case _6521006: return "6521006"; /*Polytomography*/
		case _6527005: return "6527005"; /*Uchida fimbriectomy with tubal ligation by endoscopy*/
		case _6535008: return "6535008"; /*Excision of cyst of hand*/
		case _6536009: return "6536009"; /*Implantation of tricuspid valve with tissue graft*/
		case _6543003: return "6543003"; /*Complicated catheterization of bladder*/
		case _6547002: return "6547002"; /*Repair with closure of non-surgical wound*/
		case _6555009: return "6555009"; /*Insertion of infusion pump beneath skin*/
		case _6556005: return "6556005"; /*Reticulin antibody measurement*/
		case _6562000: return "6562000"; /*Destruction of lesion of tongue*/
		case _6563005: return "6563005"; /*Transposition of muscle of hand*/
		case _6567006: return "6567006"; /*Pulmonary valve commissurotomy by transvenous balloon method*/
		case _6568001: return "6568001"; /*Diagnostic procedure on eyelid*/
		case _6585004: return "6585004"; /*Closed reduction of fracture of tarsal or metatarsal*/
		case _6589005: return "6589005"; /*Antibody titration, high protein*/
		case _6601003: return "6601003"; /*Removal of foreign body from skin of axilla*/
		case _6614002: return "6614002"; /*Antibody to single stranded DNA measurement*/
		case _6615001: return "6615001"; /*Electroretinography with medical evaluation*/
		case _6622009: return "6622009"; /*Add clasp to existing partial denture*/
		case _6634001: return "6634001"; /*Destruction of hemorrhoids, internal*/
		case _6639006: return "6639006"; /*Replacement of obstructed valve in shunt system*/
		case _6650009: return "6650009"; /*Radionuclide lacrimal flow study*/
		case _6656003: return "6656003"; /*Acoustic stimulation test*/
		case _6657007: return "6657007"; /*Maintenance drug therapy for mental disorder*/
		case _6658002: return "6658002"; /*Removal of foreign body from alveolus*/
		case _6661001: return "6661001"; /*King-Steelquist hindquarter operation*/
		case _6665005: return "6665005"; /*Restoration, crown, porcelain fused to noble metal*/
		case _6668007: return "6668007"; /*Fibrinogen assay, quantitative*/
		case _6670003: return "6670003"; /*Closure of external fistula of trachea*/
		case NULL: return "null";
		}
		return null;
	}
	
	/**
	 * The function gets the system used to encode the request code.
	 * @return the system used to encode the request code -- SNOMED
	 */	
	public String getSystem() {
		return "http://snomed.info/sct";
	}
	
	/**
	 * The function gets a human readable description associated with the request code of the ServiceRequest.
	 * @return the description associated with the code
	 */
	public String getDefinition() {
		switch (this) {
		case _104001: return "Excision of lesion of patella";
		case _115006: return "Fit removable orthodontic appliance";
		case _119000: return "Thoracoscopic partial lobectomy of lung";
		case _121005: return "Retrobulbar injection of therapeutic agent";
		case _128004: return "Hand microscope examination of skin";
		case _133000: return "Percutaneous implantation of neurostimulator electrodes into neuromuscular component";
		case _135007: return "Arthrotomy of wrist joint with exploration and biopsy";
		case _142007: return "Excision of tumor from shoulder area, deep, intramuscular";
		case _146005: return "Repair of nonunion of metatarsal with bone graft";
		case _153001: return "Cystourethroscopy with resection of ureterocele";
		case _160007: return "Removal of foreign body of tendon and/or tendon sheath";
		case _166001: return "Behavioral therapy";
		case _170009: return "Special potency disk identification, vancomycin test";
		case _174000: return "Harrison-Richardson operation on vagina";
		case _176003: return "Anastomosis of rectum";
		case _189009: return "Excision of lesion of artery";
		case _197002: return "Mold to yeast conversion test";
		case _230009: return "Miller operation, urethrovesical suspension";
		case _243009: return "Replacement of cerebral ventricular tube";
		case _245002: return "Division of nerve ganglion";
		case _262007: return "Percutaneous aspiration of renal pelvis";
		case _267001: return "Anal fistulectomy, multiple";
		case _285008: return "Incision and drainage of vulva";
		case _294002: return "Excisional biopsy of joint structure of spine";
		case _295001: return "Nonexcisional destruction of cyst of ciliary body";
		case _306005: return "US kidneys";
		case _316002: return "Partial dacryocystectomy";
		case _334003: return "Panorex examination of mandible";
		case _342002: return "Amobarbital interview";
		case _346004: return "Periodontal scaling and root planing, per quadrant";
		case _348003: return "Radionuclide dynamic function study";
		case _351005: return "Urinary undiversion of ureteral anastomosis";
		case _352003: return "Reagent RBC, preparation antibody sensitized pool";
		case _353008: return "IV/irrigation monitoring";
		case _374009: return "Costosternoplasty for pectus excavatum repair";
		case _388008: return "Blepharorrhaphy";
		case _389000: return "Tobramycin level";
		case _401004: return "Distal subtotal pancreatectomy";
		case _406009: return "Fulguration of stomach lesion";
		case _417005: return "Hospital re-admission";
		case _435001: return "Pulmonary inhalation study";
		case _445004: return "Repair of malunion of tibia";
		case _456004: return "Total abdominal colectomy with ileostomy";
		case _459006: return "Closed condylotomy of mandible";
		case _463004: return "Closed reduction of coxofemoral joint dislocation with splint";
		case _468008: return "Glutathione measurement";
		case _474008: return "Esophagoenteric anastomosis, intrathoracic";
		case _489004: return "Ferritin level";
		case _493005: return "Urobilinogen measurement, 48-hour, feces";
		case _494004: return "Excision of lesion of tonsil";
		case _497006: return "Replacement of cochlear prosthesis, multiple channels";
		case _503003: return "Corneal gluing";
		case _531007: return "Open pulmonary valve commissurotomy with inflow occlusion";
		case _533005: return "Repair of vesicocolic fistula";
		case _535003: return "Closure of ureterovesicovaginal fistula";
		case _540006: return "Antibody to single and double stranded DNA measurement";
		case _543008: return "Choledochostomy with transduodenal sphincteroplasty";
		case _545001: return "Operative procedure on lower leg";
		case _549007: return "Incision of intracranial vein";
		case _550007: return "Excision of lesion of adenoids";
		case _559008: return "Excision of varicose vein";
		case _570001: return "Vaccination for arthropod-borne viral encephalitis";
		case _574005: return "Benzodiazepine measurement";
		case _603006: return "Synchondrotomy";
		case _617002: return "Bone graft of mandible";
		case _618007: return "Frontal sinusectomy";
		case _625000: return "Removal of supernumerary digit";
		case _628003: return "Steinman test";
		case _629006: return "Lysis of adhesions of urethra";
		case _633004: return "Chart review by physician";
		case _637003: return "Lysis of adhesions of nose";
		case _642006: return "Cerebral thermography";
		case _645008: return "Diagnostic procedure on vitreous";
		case _647000: return "Excision of cervix by electroconization";
		case _657004: return "Operation on bursa";
		case _665001: return "Partial meniscectomy of temporomandibular joint";
		case _670008: return "Electrosurgical epilation of eyebrow";
		case _671007: return "Transplantation of testis";
		case _673005: return "Indirect examination of larynx";
		case _674004: return "Abduction test";
		case _676002: return "Peritoneal dialysis including cannulation";
		case _680007: return "Radiation physics consultation";
		case _687005: return "Albumin/Globulin ratio";
		case _695009: return "Destructive procedure of lesion on skin of trunk";
		case _697001: return "Hepatitis A virus antibody measurement";
		case _710006: return "Thromboendarterectomy with graft of mesenteric artery";
		case _712003: return "Closed chest suction";
		case _721002: return "Medical procedure on periurethral tissue";
		case _722009: return "Fine needle biopsy of thymus";
		case _726007: return "Pathology consultation, comprehensive, records and specimen with report";
		case _730005: return "Incision of subcutaneous tissue";
		case _741007: return "Operation on prostate";
		case _746002: return "Chiropractic adjustment of coccyx subluxation";
		case _753006: return "Manipulation of ankle AND foot";
		case _754000: return "Total urethrectomy";
		case _759005: return "Intracerebral electroencephalogram";
		case _762008: return "Computerized axial tomography of cervical spine with contrast";
		case _764009: return "Arthrodesis of interphalangeal joint of great toe";
		case _767002: return "White blood cell count - observation";
		case _789003: return "Cranial decompression, subtemporal, supratentorial";
		case _791006: return "Dressing and fixation procedure";
		case _807005: return "Excision of brain";
		case _814007: return "Electrophoresis measurement";
		case _817000: return "Excision of cyst of spleen";
		case _831000: return "Drawer test";
		case _851001: return "Root canal therapy, molar, excluding final restoration";
		case _853003: return "Fecal fat measurement, 72-hour collection";
		case _867007: return "Hypoglossofacial anastomosis";
		case _870006: return "Carbamazepine measurement";
		case _879007: return "Special blood coagulation test, explain by report";
		case _881009: return "Separation of ciliary body";
		case _893000: return "Tumor antigen measurement";
		case _897004: return "Radical maxillary antrotomy";
		case _910002: return "MHPG measurement, urine";
		case _911003: return "Removal of subarachnoid-ureteral shunt";
		case _913000: return "Chiropractic patient education";
		case _926001: return "Embolectomy with catheter of radial artery by arm incision";
		case _935008: return "Excision of bulbourethral gland";
		case _941001: return "Endoscopy of pituitary gland";
		case _945005: return "Excision of tibia and fibula for graft";
		case _948007: return "Phlebectomy of intracranial varicose vein";
		case _951000: return "Ultrasonic guidance for endomyocardial biopsy";
		case _956005: return "Anesthesia for procedure on thoracic esophagus";
		case _967006: return "Drug treatment education";
		case _969009: return "Incision and exploration of larynx";
		case _971009: return "Prosthetic construction and fitting";
		case _1001000: return "Cauterization of Bartholin's gland";
		case _1008006: return "Operation on nerve ganglion";
		case _1019009: return "Removal of corneal epithelium";
		case _1021004: return "Repair of scrotum";
		case _1029002: return "Fetoscopy";
		case _1032004: return "Enucleation of parotid gland cyst";
		case _1035002: return "Minimum bactericidal concentration test, microdilution method";
		case _1036001: return "Insertion of intravascular device in common iliac vein, complete";
		case _1041009: return "Debridement of open fracture of phalanges of foot";
		case _1042002: return "Paternity testing";
		case _1043007: return "Doppler color flow velocity mapping";
		case _1044001: return "Diagnostic ultrasound of abdomen and retroperitoneum";
		case _1048003: return "Capillary blood sampling";
		case _1054002: return "Sphincterotomy of papilla of Vater";
		case _1071001: return "Proximal splenorenal anastomosis";
		case _1084005: return "Excision of perinephric cyst";
		case _1093006: return "Excision of abdominal varicose vein";
		case _1103000: return "Transcrural mobilization of stapes";
		case _1104006: return "Triad knee repair";
		case _1115001: return "Decortication";
		case _1119007: return "Closed reduction of dislocation of foot and toe";
		case _1121002: return "Kinetic activities for range of motion";
		case _1127003: return "Interstitial radium application";
		case _1133007: return "Removal of intact mammary implant, bilateral";
		case _1163003: return "Ureteroenterostomy";
		case _1176009: return "Incision of inguinal region";
		case _1181000: return "Excision of tendon for graft";
		case _1186005: return "Anesthesia for procedure on bony pelvis";
		case _1198000: return "Excisional biopsy of bone of scapula";
		case _1209007: return "Arthroscopic repair lateral meniscus";
		case _1225002: return "Upper arm X-ray";
		case _1227005: return "Incision of subvalvular tissue for discrete subvalvular aortic stenosis";
		case _1235008: return "Muscle transfer";
		case _1237000: return "Application of cast, sugar tong";
		case _1238005: return "Epiphyseal arrest by stapling of distal radius";
		case _1251000: return "Incisional biopsy of testis";
		case _1253002: return "Refusion of spine";
		case _1258006: return "Excision of meniscus of wrist";
		case _1266002: return "Closure of tympanic membrane perforation";
		case _1267006: return "Electrocoagulation of lesion of vagina";
		case _1278003: return "Open reduction of closed shoulder dislocation with fracture of greater tuberosity";
		case _1279006: return "Repair of cardiac pacemaker pocket in skin AND/OR subcutaneous tissue";
		case _1292009: return "MRI of bladder";
		case _1299000: return "Excision of appendiceal stump";
		case _1315009: return "Reconstruction of eyebrow";
		case _1316005: return "Upper partial denture, cast metal base without resin saddles, including any conventional clasps, rests and teeth";
		case _1324000: return "Cerebrospinal fluid immunoglobulin G ratio and immunoglobulin G index";
		case _1327007: return "Procedure on Meckel diverticulum";
		case _1328002: return "Ilioiliac shunt";
		case _1329005: return "Division of congenital web of larynx";
		case _1337002: return "Colosigmoidostomy";
		case _1339004: return "Manual evacuation of feces";
		case _1347004: return "Medical procedure on palate";
		case _1352009: return "Anterior spinal rhizotomy";
		case _1358008: return "Anti-human globulin test, enzyme technique, titer";
		case _1366004: return "Breathing treatment";
		case _1385001: return "Echography, scan B-mode for foetal age determination";
		case _1390003: return "Laparoscopic sigmoid colectomy";
		case _1398005: return "Direct thrombectomy of iliac vein by leg incision";
		case _1399002: return "Incision and exploration of ureter";
		case _1407007: return "Application of long leg cast, brace type";
		case _1410000: return "Anesthesia for tympanotomy";
		case _1411001: return "Operation on papillary muscle of heart";
		case _1413003: return "Penetrating keratoplasty with homograft";
		case _1414009: return "Angiography of arteriovenous shunt";
		case _1417002: return "Operation on face";
		case _1431002: return "pexy";
		case _1440003: return "Repair with resection-recession";
		case _1449002: return "Removal of hair";
		case _1453000: return "Biofeedback, galvanic skin response";
		case _1455007: return "Cerclage";
		case _1457004: return "Truncal vagotomy with pyloroplasty and gastrostomy";
		case _1494008: return "Osmolarity measurement";
		case _1500007: return "Bilateral epididymovasostomy";
		case _1501006: return "Altemeier operation, perineal rectal pull-through";
		case _1505002: return "Hospital admission for isolation";
		case _1529009: return "Aspiration of soft tissue";
		case _1533002: return "Ureteroplication";
		case _1550000: return "Amikacin level";
		case _1555005: return "Brief group psychotherapy";
		case _1559004: return "Interleukin (IL)-2 assay";
		case _1576000: return "Repair of intestinouterine fistula";
		case _1577009: return "Implantation of cardiac single-chamber device replacement, rate-responsive";
		case _1578004: return "Reconstruction of ossicles with stapedectomy";
		case _1583007: return "Tractotomy of mesencephalon";
		case _1585000: return "Lengthening of gastrocnemius muscle";
		case _1596008: return "Anesthesia for total elbow replacement";
		case _1597004: return "Skeletal X-ray of ankle and foot";
		case _1602006: return "Social service interview with planning";
		case _1614003: return "Bilateral repair of inguinal hernia, direct";
		case _1615002: return "Reline upper partial denture, chairside";
		case _1616001: return "Galactosylceramide beta-galactosidase measurement, leukocytes";
		case _1636000: return "Injection of sclerosing agent in varicose vein";
		case _1638004: return "Cineplasty with cineplastic prosthesis of extremity";
		case _1640009: return "History and physical examination, insurance";
		case _1645004: return "Transduodenal sphincterotomy";
		case _1651009: return "Excision of tendon sheath";
		case _1653007: return "Internal fixation of bone without fracture reduction";
		case _1669000: return "Making occupied bed";
		case _1677001: return "Haagensen test";
		case _1678006: return "Endoscopic procedure of nerve";
		case _1680000: return "Secondary chemoprophylaxis";
		case _1683003: return "Direct closure of laceration of conjunctiva";
		case _1689004: return "Local excision of ovary";
		case _1691007: return "Drainage of abscess of tonsil";
		case _1699009: return "Special dosimetry";
		case _1702002: return "Labial veneer, resin laminate, laboratory";
		case _1704001: return "Correction of tibial pseudoarthrosis";
		case _1709006: return "Breast reconstruction, bilateral, with bilateral pedicle transverse rectus abdominis myocutaneous flaps";
		case _1712009: return "Immunoglobulin typing, immunoglobulin G";
		case _1713004: return "Hypothermia, total body, induction and maintenance";
		case _1730002: return "Suture of skin wound of hindfoot";
		case _1746005: return "Buckling of sclera using implant";
		case _1747001: return "Replacement of skeletal muscle stimulator";
		case _1753001: return "Resection of uveal tissue";
		case _1757000: return "Arthroscopy of wrist with partial synovectomy";
		case _1759002: return "Assessment of nutritional status";
		case _1770009: return "Mitral valvotomy";
		case _1774000: return "Nasopharyngeal rehabilitation";
		case _1775004: return "Submaxillary incision with drainage";
		case _1784004: return "Fecal stercobilin, qualitative";
		case _1787006: return "Ultrasonic guidance for pericardiocentesis";
		case _1788001: return "Blood unit collection for directed donation, donor";
		case _1801001: return "Endoscopic biopsy of duodenum";
		case _1805005: return "Take-down of stoma";
		case _1811008: return "Aspiration of bursa of hand";
		case _1813006: return "Cryotherapy of genital warts";
		case _1820004: return "Ethanol measurement, breath";
		case _1830008: return "Open reduction of open sacral fracture";
		case _1836002: return "Excision of diverticulum of ventricle of heart";
		case _1844002: return "Plication of ligament";
		case _1854003: return "Incision of nose";
		case _1859008: return "Hand tendon foreign body removed";
		case _1861004: return "Anesthesia for closed procedure on humerus and elbow";
		case _1862006: return "Thoracic phlebectomy";
		case _1866009: return "Bilateral total nephrectomy";
		case _1868005: return "FB - Removal of foreign body from brain";
		case _1870001: return "Insertion of halo device of skull with synchronous skeletal traction";
		case _1871002: return "Repair of aneurysm of coronary artery";
		case _1872009: return "Suture of male perineum";
		case _1876007: return "Recession of prognathic jaw";
		case _1879000: return "Fluorescent antigen measurement";
		case _1889001: return "Patient transfer, in-hospital, unit-to-unit";
		case _1906007: return "Insertion of prosthesis or prosthetic device of arm, bioelectric or cineplastic";
		case _1907003: return "Bifurcation of bone";
		case _1917008: return "Patient discharge, deceased, medicolegal case";
		case _1924009: return "Hepaticotomy with drainage";
		case _1950008: return "Drainage of nasal septal abscess";
		case _1958001: return "Grafting of bone of thumb with transfer of skin flap";
		case _1966005: return "Central block anesthesia";
		case _1983001: return "Total urethrectomy including cystostomy in female";
		case _1995001: return "Stripping of cerebral meninges";
		case _1999007: return "Psychologic test";
		case _2002009: return "Construction of subcutaneous tunnel without esophageal anastomosis";
		case _2021001: return "Internal fixation of radius and ulna without fracture reduction";
		case _2051007: return "Red cell iron utilization study";
		case _2054004: return "Barbiturates measurement, quantitative and qualitative";
		case _2067001: return "Implantation of electromagnetic hearing aid";
		case _2069003: return "Dental subperiosteal implant";
		case _2078009: return "Puncture of bursa of hand";
		case _2079001: return "Reimplantation of anomalous pulmonary artery";
		case _2080003: return "Angiectomy with anastomosis of lower limb artery";
		case _2098004: return "Open reduction of open mandibular fracture with external fixation";
		case _2115003: return "Dental prophylaxis, children";
		case _2119009: return "Repair of blood vessel";
		case _2127000: return "Reduction of closed sacral fracture";
		case _2137005: return "Excision of pericardial tumor";
		case _2153008: return "Cardiac catheterization education";
		case _2161003: return "Operation on vulva";
		case _2164006: return "Injection of aorta";
		case _2166008: return "Bicuspidization of aortic valve";
		case _2171001: return "Excision of tonsil tags";
		case _2178007: return "Ureterocentesis";
		case _2181002: return "Operation for bone injury of tarsals and metatarsals";
		case _2188008: return "Suture of tendon to skeletal attachment";
		case _2193006: return "Repair of ruptured aneurysm with graft of celiac artery";
		case _2196003: return "Gas liquid chromatography, electron capture type";
		case _2199005: return "Excision of lesion of cul-de-sac";
		case _2214008: return "Curette test of skin";
		case _2220009: return "Complement component assay";
		case _2225004: return "Sensititer system test";
		case _2234009: return "Proctosigmoidopexy";
		case _2238007: return "Stone operation, anoplasty";
		case _2242005: return "Reconstruction of eyelid";
		case _2244006: return "Arthroscopy of wrist with internal fixation for instability";
		case _2250001: return "Resection of ascending aorta with anastomosis";
		case _2252009: return "Hospital admission, urgent, 48 hours";
		case _2266004: return "Venography of adrenal, bilateral";
		case _2267008: return "Replacement of tracheostomy tube";
		case _2270007: return "Correction of cleft hand";
		case _2276001: return "Exploration of popliteal artery";
		case _2278000: return "Urinalysis, automated";
		case _2279008: return "Antibody detection, red blood cell, enzyme, 1 stage technique, including anti-human globulin";
		case _2290003: return "Microbial culture, anaerobic, initial isolation";
		case _2315006: return "Brain meninges operation";
		case _2318008: return "Anesthesia for cast procedure on forearm, wrist or hand";
		case _2321005: return "Delivery by Ritgen maneuver";
		case _2322003: return "Suture of recent wound of eyelid, direct closure, full-thickness";
		case _2337004: return "Adductor tenotomy";
		case _2344008: return "Complicated cystorrhaphy";
		case _2347001: return "Diagnostic model construction";
		case _2364003: return "Radical resection of tumor of soft tissue of wrist area";
		case _2371008: return "Tympanoplasty type II with graft against incus or malleus";
		case _2373006: return "Buffy coat smear evaluation";
		case _2382000: return "Application of breast pump";
		case _2386002: return "Closed reduction of dislocation of patella";
		case _2393003: return "Ligation of vein of lower limb";
		case _2406000: return "Chart periodontal pocket";
		case _2407009: return "Excision of mediastinal tumor";
		case _2408004: return "Hexosaminidase A and total hexosaminidase measurement, serum";
		case _2409007: return "Replantation of toe";
		case _2425002: return "Epstein-Barr virus serologic test";
		case _2442008: return "Incision of lacrimal canaliculus";
		case _2448007: return "Cell count of synovial fluid with differential count";
		case _2455009: return "Revision of lumbosubarachnoid shunt";
		case _2457001: return "Blind rehabilitation";
		case _2458006: return "Educational therapy";
		case _2459003: return "Destructive procedure of artery of upper extremity";
		case _2461007: return "Tennis elbow test";
		case _2474001: return "Repair of malunion of metatarsal bones";
		case _2475000: return "Twenty-four hour collection of urine";
		case _2480009: return "Debridement of skin, subcutaneous tissue, muscle and bone";
		case _2486003: return "Destructive procedure of breast";
		case _2488002: return "Provision of contact lens";
		case _2494005: return "Nurse to nurse communication";
		case _2498008: return "Rebase of upper partial denture";
		case _2507007: return "5' Nucleotidase measurement";
		case _2508002: return "Retrograde urography with kidney-ureter-bladder";
		case _2514009: return "Manual reduction of closed supracondylar fracture of humerus with traction";
		case _2517002: return "Stroke rehabilitation";
		case _2530001: return "Chiropractic visit";
		case _2531002: return "Mononuclear cell function assay";
		case _2535006: return "Removal of pulp - complete";
		case _2536007: return "Injection of medication in anterior chamber of eye";
		case _2547000: return "Excision of keloid";
		case _2552005: return "Incision of cerebral subarachnoid space";
		case _2564002: return "Creation of lumbar shunt including laminectomy";
		case _2566000: return "Osteoplasty of radius";
		case _2567009: return "Resection of rib by transaxillary approach";
		case _2580007: return "Transplant of hair follicles to scalp";
		case _2598006: return "Open heart surgery";
		case _2601001: return "Removal of bone flap of skull";
		case _2607002: return "Operation of supporting structures of uterus";
		case _2613006: return "Implantation of joint prosthesis of hand";
		case _2614000: return "Removal of ligature from fallopian tube";
		case _2616003: return "Repair of bifid digit of hand";
		case _2619005: return "Psychiatric interpretation to family or parents of patient";
		case _2629003: return "Intracranial/cerebral perfusion pressure monitoring";
		case _2632000: return "Incision and drainage of infected bursa of upper arm";
		case _2642003: return "Prefabricated post and core in addition to crown";
		case _2643008: return "Ligation of varicose vein of head and neck";
		case _2644002: return "Cauterization of liver";
		case _2645001: return "Intelligence test/WB1";
		case _2646000: return "Incision and exploration of vas deferens";
		case _2658000: return "Social service interview of patient";
		case _2659008: return "Suture of ligament of lower extremity";
		case _2668005: return "Recementation of space maintainer";
		case _2670001: return "Diagnostic procedure on cornea";
		case _2673004: return "Incision and drainage of masticator space by extraoral approach";
		case _2677003: return "Stripping";
		case _2690005: return "MRI of pelvis";
		case _2693007: return "Stool fat, quantitative measurement";
		case _2696004: return "Hepatic venography with hemodynamic evaluation";
		case _2697008: return "Stripping and ligation of great saphenous vein";
		case _2716009: return "Dermal-fat-fascia graft";
		case _2722000: return "Interleukin-3 assay";
		case _2731000: return "Serologic test for influenza virus A";
		case _2732007: return "Recession of tendon of hand";
		case _2737001: return "Exploratory craniotomy, infratentorial";
		case _2742009: return "Destruction of Bartholin's gland";
		case _2743004: return "Operative endoscopy of ileum";
		case _2745006: return "Epiplopexy";
		case _2752008: return "Incudopexy";
		case _2780005: return "Osteoplasty of facial bones";
		case _2794006: return "Cauterization of navel";
		case _2802005: return "Manual dilation and stretching";
		case _2811005: return "Cineradiography of pharynx";
		case _2813008: return "Nephroureterocystectomy";
		case _2837008: return "Transposition of ulnar nerve at elbow";
		case _2842000: return "Gas chromatography measurement";
		case _2843005: return "Revision of urinary conduit";
		case _2847006: return "Cervical myelography";
		case _2851008: return "Arthrotomy for synovectomy of sternoclavicular joint";
		case _2854000: return "Bursectomy of hand";
		case _2857007: return "Pinealectomy";
		case _2866006: return "Obliteration of lymphatic structure";
		case _2875008: return "Implantation of joint prosthesis of elbow";
		case _2876009: return "Hospital admission, type unclassified, explain by report";
		case _2885009: return "Intradermal allergen test";
		case _2891006: return "Arthroscopy of elbow with partial synovectomy";
		case _2898000: return "Deoxyribonucleic acid analysis, antenatal, blood";
		case _2903001: return "Diagnostic procedure on anterior chamber of eye";
		case _2908005: return "Cryotherapy to hemorrhoid";
		case _2914003: return "Anterior sclerotomy";
		case _2915002: return "Suture of capsule of ankle";
		case _2933008: return "Pneumogynecography";
		case _2945004: return "Suprapubic diverticulectomy of urinary bladder";
		case _2947007: return "Therapeutic compound measurement";
		case _2960001: return "Closure of fistula of uterine cervix";
		case _2968008: return "Craniectomy with treatment of penetrating wound of brain";
		case _2970004: return "Metacarpal lengthening and transfer of local flap";
		case _2971000: return "Closure of acquired urethrovaginal fistula";
		case _2977001: return "Thrombectomy of lower limb vein";
		case _3001009: return "Total lobectomy with bronchoplasty";
		case _3010001: return "Removal of silastic tubes from ear";
		case _3016007: return "Removal of Crutchfield tongs from skull";
		case _3025001: return "Calcitonin measurement";
		case _3026000: return "Tibiotalar arthrodesis";
		case _3029007: return "Peripheral nervous system disease rehabilitation";
		case _3041000: return "Repair of stomach";
		case _3047001: return "Kowa fundus photography";
		case _3060007: return "Forequarter amputation, right";
		case _3061006: return "Complete excision of nail AND nail matrix";
		case _3063009: return "Gastroscopy through artificial stoma";
		case _3075004: return "Nonoperative removal of prosthesis of bile duct";
		case _3078002: return "Embolectomy with catheter of renal artery by abdominal incision";
		case _3083005: return "Removal of device from thorax";
		case _3088001: return "Anesthesia for endoscopic procedure on upper extremity";
		case _3090000: return "Aneurysmectomy with graft replacement of lower limb artery";
		case _3112006: return "Restraint removal";
		case _3116009: return "Clotting screening";
		case _3130004: return "Monitoring of cardiac output by electrocardiogram";
		case _3133002: return "Patient discharge, deceased, autopsy";
		case _3137001: return "Replacement";
		case _3143004: return "Visual field examination and evaluation, intermediate";
		case _3162001: return "Gadolinium measurement";
		case _3164000: return "Open reduction of closed mandibular fracture with interdental fixation";
		case _3165004: return "Irrigation of muscle of hand";
		case _3166003: return "Closure of fistula of salivary gland";
		case _3177009: return "Internal obstetrical version";
		case _3183007: return "Closure of colostomy";
		case _3186004: return "Excision of Skene gland";
		case _3190002: return "Epilation by forceps";
		case _3204007: return "Destructive procedure of nerve";
		case _3241008: return "Correction of chordee with mobilization of urethra";
		case _3249005: return "Surgical construction of filtration bleb";
		case _3251009: return "Mayo operation, herniorrhaphy";
		case _3256004: return "Cervical lymphangiogram";
		case _3257008: return "Empty and measure peritoneal dialysis fluid";
		case _3258003: return "Cerebral arteriography";
		case _3268008: return "Transplantation of tissue of pelvic region";
		case _3270004: return "Implantation of neurostimulator in spine";
		case _3278006: return "Lysis of adhesions of bursa of hand";
		case _3287002: return "Cholecystogastrostomy";
		case _3320000: return "Abt - autologous blood transfusion";
		case _3324009: return "Laser beam photocoagulation";
		case _3326006: return "Excision of exostosis of head of fifth metatarsal";
		case _3328007: return "Incision of vein of head and neck";
		case _3333006: return "Application of short arm splint, forearm to hand, static";
		case _3338002: return "Open reduction of open radial shaft fracture";
		case _3352000: return "PTH - Parathyroid hormone level";
		case _3357006: return "Iron kinetics";
		case _3360004: return "Biliary anastomosis";
		case _3390006: return "Verification procedure";
		case _3399007: return "Reduction of torsion of omentum";
		case _3407002: return "Creation of lesion of spinal cord by percutaneous method";
		case _3413006: return "Blood cell morphology";
		case _3418002: return "Chondrectomy of spine";
		case _3432000: return "Preventive dental service";
		case _3443008: return "Pulp capping";
		case _3448004: return "Fixation of contralateral testis";
		case _3450007: return "Lymphocytes, T & B cell evaluation";
		case _3457005: return "Referral procedure";
		case _3479000: return "Removal of heart assist system with replacement";
		case _3498003: return "Total excision of pituitary gland by transsphenoidal approach";
		case _3499006: return "Aspiration of vitreous with replacement";
		case _3509001: return "Streptococcus vaccination";
		case _3512003: return "Angiography of arteries of extremity";
		case _3515001: return "Replacement of electronic heart device, pulse generator";
		case _3517009: return "Removal of foreign body of pelvis from subcutaneous tissue";
		case _3518004: return "Aversive psychotherapy";
		case _3527003: return "Antibody measurement";
		case _3546002: return "CVG - Coronary vein graft";
		case _3559005: return "Insertion of ureteral stent with ureterotomy";
		case _3562008: return "Rodney Smith operation, radical subtotal pancreatectomy";
		case _3564009: return "Removal of foreign body from fallopian tube";
		case _3575008: return "Repair of fascia with graft of fascia";
		case _3580004: return "Removal of calculus of pharynx";
		case _3605001: return "Reduction of ciliary body";
		case _3607009: return "Transplantation of mesenteric tissue";
		case _3620007: return "Red cell survival study with hepatic sequestration";
		case _3625002: return "Anesthesia for brachial arteriograms, retrograde";
		case _3651000: return "Morphometric analysis, nerve";
		case _3654008: return "Excision of lingula";
		case _3659003: return "Incision of inner ear";
		case _3664004: return "Closure of scleral fistula";
		case _3666002: return "Repair of peripheral nerve by suturing";
		case _3669009: return "Fitting of prosthesis or prosthetic device of upper arm";
		case _3673007: return "Leadbetter urethral reconstruction";
		case _3683006: return "Selenium measurement, urine";
		case _3686003: return "Zancolli operation for tendon transfer of biceps";
		case _3688002: return "Anesthesia for lens surgery";
		case _3690001: return "Shunt of left subclavian to descending aorta by Blalock-Park operation";
		case _3691002: return "Wedge osteotomy of tarsals and metatarsals";
		case _3697003: return "Tissue processing technique, routine, embed, cut and stain, per autopsy";
		case _3700004: return "Erysophake extraction of lens";
		case _3701000: return "Removal of foreign body of hip from subcutaneous tissue";
		case _3713005: return "Release for de Quervain tenosynovitis of hand";
		case _3717006: return "Dilute Russell viper venom time";
		case _3734003: return "SSG - Split skin graft";
		case _3735002: return "Coproporphyrin III measurement";
		case _3740005: return "Removal of foreign body of canthus by incision";
		case _3748003: return "Biopsy of perirenal tissue";
		case _3749006: return "Reduction of closed ischial fracture";
		case _3758004: return "Thrombectomy with catheter of subclavian artery by neck incision";
		case _3770000: return "Ward urine dip stick testing";
		case _3778007: return "Scrotum manipulation";
		case _3780001: return "Routine patient disposition, no follow-up planned";
		case _3784005: return "Delayed hypersensitivity skin test for streptokinase-streptodornase";
		case _3786007: return "Excision of lesion of pharynx";
		case _3787003: return "Ultrasonic guidance for needle biopsy";
		case _3794000: return "Pregnanetriol measurement";
		case _3796003: return "Excision of redundant mucosa from jejunostomy";
		case _3799005: return "Radiography of adenoids";
		case _3802001: return "Topical application of tooth medicament - desensitizing agent";
		case _3819004: return "Embolization of thoracic artery";
		case _3826004: return "Blepharotomy with drainage of abscess of eyelid";
		case _3828003: return "Open biopsy of vertebral body of thoracic region";
		case _3831002: return "Chiropractic application of ice";
		case _3843001: return "Removal of foreign body from fascia";
		case _3858009: return "Echography of thyroid, A-mode";
		case _3861005: return "Aneurysmectomy with anastomosis of lower limb artery";
		case _3862003: return "Total vital capacity measurement";
		case _3864002: return "Excisional biopsy of scrotum";
		case _3880007: return "Excision of lesion of fibula";
		case _3881006: return "Incision and drainage of submental space by extraoral approach";
		case _3887005: return "Wart ligation";
		case _3889008: return "Suture of lip";
		case _3891000: return "Comprehensive orthodontic treatment, permanent dentition, for class I malocclusion";
		case _3895009: return "Dressing";
		case _3907006: return "Incision and drainage of retroperitoneal abscess";
		case _3911000: return "Transplantation of muscle";
		case _3915009: return "Excision of artery of thorax and abdomen";
		case _3917001: return "Excisional biopsy of phalanges of foot";
		case _3918006: return "Plastic repair with lengthening";
		case _3926003: return "Lactate measurement";
		case _3929005: return "Patient transfer, in-hospital, bed-to-bed";
		case _3936006: return "Making Foster bed";
		case _3938007: return "Cerclage for retinal reattachment";
		case _3942005: return "Cystopexy";
		case _3955006: return "Antibody elution from red blood cells";
		case _3957003: return "Arteriectomy of thoracoabdominal aorta";
		case _3963007: return "Operation on submaxillary gland";
		case _3967008: return "Fluorescence polarization immunoassay";
		case _3968003: return "Excision of spinal facet joint";
		case _3969006: return "Removal of osteocartilagenous loose body from joint structures";
		case _3971006: return "Duchenne muscular dystrophy carrier detection";
		case _3980006: return "Partial excision of esophagus";
		case _3981005: return "Carrier detection, molecular genetics";
		case _3985001: return "Anesthesia for procedure on arteries of lower leg with bypass graft";
		case _3991004: return "MRI of pelvis, prostate and bladder";
		case _3998005: return "Bone imaging of limited area";
		case _4007002: return "Anti-human globulin test, indirect, titer, non-gamma";
		case _4008007: return "Phlebography of neck";
		case _4010009: return "Oophorectomy of remaining ovary with tube";
		case _4027001: return "Implantation of electronic stimulator into phrenic nerve";
		case _4034004: return "Closed reduction of facial fracture, except mandible";
		case _4035003: return "Restoration, resin, two surfaces, posterior, permanent";
		case _4036002: return "Arthroscopy of elbow with extensive debridement";
		case _4037006: return "Removal of vascular graft or prosthesis";
		case _4044002: return "Construction of permanent colostomy";
		case _4045001: return "Drainage of cerebral ventricle by incision";
		case _4052004: return "Percutaneous aspiration of spinal cord cyst";
		case _4064007: return "Specimen aliquoting";
		case _4068005: return "Removal of ventricular reservoir with synchronous replacement";
		case _4083000: return "Fitting of prosthesis or prosthetic device of lower arm";
		case _4084006: return "Repair of tendon of hand by graft or implant of muscle";
		case _4090005: return "Replacement of transvenous atrial and ventricular pacemaker electrode leads";
		case _4094001: return "Reduction of retroversion of uterus by suppository";
		case _4101004: return "Revision of spinal pleurothecal shunt";
		case _4102006: return "Root canal therapy, anterior, excluding final restoration";
		case _4114003: return "Parenteral chemotherapy for malignant neoplasm";
		case _4116001: return "Construction of window";
		case _4119008: return "Intracranial phlebectomy with anastomosis";
		case _4131005: return "Implantation into pelvic region";
		case _4134002: return "Operative block anesthesia";
		case _4139007: return "Posterior spinal cordotomy";
		case _4143006: return "Injection into anterior chamber of eye";
		case _4149005: return "Bone histomorphometry, aluminum stain";
		case _4154001: return "Incision and drainage of penis";
		case _4165006: return "Delayed hypersensitivity skin test for staphage lysate";
		case _4176005: return "Fothergill repair";
		case _4192000: return "Toxicology testing for organophosphate insecticide";
		case _4213001: return "Implantation of Ommaya reservoir";
		case _4214007: return "Intracardiac injection for cardiac resuscitation";
		case _4226002: return "Excision of lesion of thoracic vein";
		case _4252008: return "Aneurysmectomy with graft replacement by interposition";
		case _4263006: return "Biopsy of soft tissue of elbow area, superficial";
		case _4266003: return "Patient referral for drug addiction rehabilitation";
		case _4285000: return "Insertion of bone growth stimulator into femur";
		case _4293000: return "Reduction of intussusception by laparotomy";
		case _4304000: return "Excision of cusp of tricuspid valve";
		case _4319004: return "Rebase of complete lower denture";
		case _4321009: return "Bilateral leg arteriogram";
		case _4323007: return "Destruction of lesion of sclera";
		case _4331002: return "Anesthesia for hernia repair in lower abdomen";
		case _4333004: return "Incision and drainage of perisplenic space";
		case _4336007: return "Lloyd-Davies operation, abdominoperineal resection";
		case _4337003: return "Homogentisic acid measurement";
		case _4339000: return "Repair of nasolabial fistula";
		case _4341004: return "Complete submucous resection of turbinate";
		case _4344007: return "Cryopexy";
		case _4348005: return "Musculoplasty of hand";
		case _4350002: return "Removal of implant of cornea";
		case _4363008: return "Endoscopic brush biopsy of trachea";
		case _4365001: return "Surgical repair";
		case _4380007: return "Transposition of vulvar tissue";
		case _4387005: return "Valvuloplasty of pulmonary valve in total repair of tetralogy of Fallot";
		case _4388000: return "Repair of splenocolic fistula";
		case _4407008: return "Slitting of lacrimal canaliculus for passage of tube";
		case _4411002: return "Removal of device from female genital tract";
		case _4420006: return "Incision and drainage of parapharyngeal abscess by external approach";
		case _4424002: return "Making orthopedic bed";
		case _4436008: return "Methylatable chemotaxis protein (MCP) receptor measurement";
		case _4438009: return "Venography of vena cava";
		case _4443002: return "Decortication of ovary";
		case _4447001: return "Autopsy, gross and microscopic examination, stillborn or newborn without central nervous system";
		case _4449003: return "Manipulation of spinal meninges";
		case _4450003: return "Application of Kirschner wire";
		case _4455008: return "Open reduction of open elbow dislocation";
		case _4457000: return "Insertion of mold into vagina";
		case _4466001: return "Exploration of upper limb artery";
		case _4467005: return "Excision of tumor of ankle area, deep, intramuscular";
		case _4475004: return "Cyanide level";
		case _4487006: return "Norepinephrine measurement, supine";
		case _4489009: return "Neurolysis of trigeminal nerve";
		case _4496006: return "Mouthcare procedure";
		case _4503005: return "Removal of foreign body of sclera without use of magnet";
		case _4504004: return "Potter obstetrical version with extraction";
		case _4505003: return "Tenolysis of flexor tendon of forearm";
		case _4507006: return "Decompression fasciotomy of wrist, flexor and extensor compartment";
		case _4511000: return "Restoration, inlay, composite/resin, one surface, laboratory processed";
		case _4516005: return "Iridencleisis and iridotasis";
		case _4520009: return "Anastomosis of esophagus, antesternal or antethoracic, with insertion of prosthesis";
		case _4525004: return "Seen by casualty - service";
		case _4533003: return "Ligation of artery of lower limb";
		case _4535005: return "Incision of pelvirectal tissue";
		case _4539004: return "Excision of cyst of bronchus";
		case _4542005: return "Closed reduction of fracture of foot";
		case _4544006: return "Excision of subcutaneous tumor of extremities";
		case _4558008: return "Anterior resection of rectum";
		case _4563007: return "Hospital admission, transfer from other hospital or health care facility";
		case _4570007: return "Chemopallidectomy";
		case _4579008: return "Creation of ventriculoatrial shunt";
		case _4581005: return "Coreoplasty";
		case _4585001: return "Decompression of tendon of hand";
		case _4587009: return "Epiphysiodesis of distal radius";
		case _4589007: return "Care relating to reproduction and pregnancy";
		case _4593001: return "Cauterization of sclera with iridectomy";
		case _4594007: return "Coproporphyrin isomers, series I & III, urine";
		case _4613005: return "Radioimmunoassay";
		case _4625008: return "Apical pulse taking";
		case _4626009: return "Take-down of arterial anastomosis";
		case _4636001: return "Denker operation for radical maxillary antrotomy";
		case _4640005: return "Ligation of fallopian tubes by abdominal approach";
		case _4642002: return "Removal of inflatable penile prosthesis, with pump, reservoir and cylinders";
		case _4660002: return "Diagnostic procedure on phalanges of foot";
		case _4670000: return "Catheterization of bronchus";
		case _4671001: return "Excision of lesion from sphenoid sinus";
		case _4672008: return "Medical procedure on the nervous system";
		case _4691008: return "Identification of rotavirus antigen in feces";
		case _4692001: return "Transplantation of artery of upper extremity";
		case _4694000: return "Percutaneous biopsy of muscle";
		case _4699005: return "Alpha naphthyl butyrate stain method, blood or bone marrow";
		case _4701005: return "Colony forming unit-granulocyte-monocyte-erythroid-megakaryocyte assay";
		case _4707009: return "Partial excision of calcaneus";
		case _4712005: return "Removal of Gardner Wells tongs from skull";
		case _4713000: return "Endoscopy and photography";
		case _4719001: return "Psychologic cognitive testing and assessment";
		case _4727005: return "Lipoprotein electrophoresis";
		case _4734007: return "Irrigation of wound catheter of integument";
		case _4737000: return "Mycobacteria culture";
		case _4756005: return "Cryotherapy of subcutaneous tissue";
		case _4758006: return "Incudostapediopexy";
		case _4764004: return "Jet ventilation procedure";
		case _4765003: return "Insertion of ocular implant following or secondary to enucleation";
		case _4770005: return "Colporrhaphy for repair of urethrocele";
		case _4772002: return "Reduction of torsion of spermatic cord";
		case _4784000: return "Operation on sublingual gland";
		case _4804005: return "Microbial identification test";
		case _4811009: return "Reconstruction of diaphragm";
		case _4815000: return "Antibody identification, red blood cell antibody panel, enzyme, 2 stage technique including anti-human globulin";
		case _4820000: return "Incision of labial frenum";
		case _4827002: return "Shower hydrotherapy";
		case _4829004: return "Excision of small intestine for interposition";
		case _4847005: return "Anesthesia for cesarean section";
		case _4849008: return "Ovarian biopsy";
		case _4862007: return "Revision of anastomosis of large intestine";
		case _4877004: return "Extracapsular extraction of lens with iridectomy";
		case _4891005: return "Proctostomy";
		case _4895001: return "Construction of sigmoid bladder";
		case _4902005: return "Ethchlorvynol measurement";
		case _4903000: return "Serum protein electrophoresis";
		case _4904006: return "Dilation of anal sphincter under nonlocal anesthesia";
		case _4914002: return "Treatment planning for teletherapy";
		case _4929000: return "Local perfusion of kidney";
		case _4930005: return "Repair of thoracogastric fistula";
		case _4934001: return "Salpingography";
		case _4957007: return "Cervical spinal fusion for pseudoarthrosis";
		case _4966006: return "Extracorporeal perfusion";
		case _4970003: return "Venography";
		case _4974007: return "Liver operation";
		case _4976009: return "Anesthesia for endoscopic procedure on lower extremity";
		case _4987001: return "Osteoplasty of cranium with flap of bone";
		case _4992004: return "Cardiac catheterization, left heart, retrograde, percutaneous";
		case _4993009: return "Ischemic limb exercise with electromyography and lactic acid determination";
		case _5016005: return "Pontic, resin with high noble metal";
		case _5019003: return "Direct laryngoscopy with biopsy";
		case _5021008: return "Aldosterone measurement, standing, normal salt diet";
		case _5022001: return "Lysergic acid diethylamide measurement";
		case _5025004: return "Semen analysis, presence and motility of sperm";
		case _5032008: return "Labial veneer, porcelain laminate, laboratory";
		case _5034009: return "Graft to hair-bearing skin";
		case _5048009: return "External cephalic version with tocolysis";
		case _5055006: return "Uniscept system test";
		case _5057003: return "Radical orbitomaxillectomy";
		case _5065000: return "Reduction of closed traumatic hip dislocation with anesthesia";
		case _5091004: return "Peripheral vascular disease study";
		case _5105000: return "Endoscopy of renal pelvis";
		case _5110001: return "Ultrasound peripheral imaging, real time scan";
		case _5113004: return "FT4 - Free thyroxine level";
		case _5119000: return "Epiglottidectomy";
		case _5121005: return "Wedge osteotomy of pelvic bone";
		case _5123008: return "Anesthesia for procedure on pericardium with pump oxygenator";
		case _5130002: return "Needling of lens for cataract";
		case _5131003: return "Radiography of chest wall";
		case _5135007: return "Diagnostic procedure on scapula";
		case _5147001: return "Excision of lesion of ankle joint";
		case _5151004: return "Manual reduction of rectal hemorrhoids";
		case _5154007: return "Communication enhancement: speech deficit";
		case _5161006: return "Specialty clinic admission";
		case _5162004: return "Excision of pressure ulcer";
		case _5165002: return "Division of thoracic artery";
		case _5176003: return "Thromboendarterectomy with graft of renal artery";
		case _5182000: return "Total body perfusion";
		case _5184004: return "Osteotomy of shaft of femur with fixation";
		case _5186002: return "Arthrotomy for synovectomy of glenohumeral joint";
		case _5190000: return "Cell fusion";
		case _5191001: return "Surgical treatment of missed miscarriage of second trimester";
		case _5212002: return "Excision of lesion of lacrimal gland by frontal approach";
		case _5216004: return "Three dimensional ultrasound imaging of heart";
		case _5233006: return "Lateral fasciotomy";
		case _5243009: return "Suture of adenoid fossa";
		case _5245002: return "Transplantation of peripheral vein";
		case _5246001: return "Breakpoint cluster region analysis";
		case _5264008: return "Total bile acids measurement";
		case _5267001: return "Adrenal artery ligation";
		case _5270002: return "Bilateral destruction of fallopian tubes";
		case _5273000: return "Manual reduction of closed fracture of proximal end of ulna";
		case _5282006: return "Operation on oropharynx";
		case _5290006: return "Incision and drainage of Ludwig angina";
		case _5298004: return "Incision and drainage of deep hematoma of thigh region";
		case _5304008: return "DXT - Radiotherapy";
		case _5316002: return "Closed osteotomy of mandibular ramus";
		case _5317006: return "Radical amputation of penis with bilateral pelvic lymphadenectomy";
		case _5326009: return "Administration of dermatologic formulation";
		case _5328005: return "Shortening of Achilles tendon";
		case _5337005: return "Trocar biopsy";
		case _5338000: return "Nicotine measurement";
		case _5342002: return "Prophylactic treatment of tibia with methyl methacrylate";
		case _5348003: return "Repair of endocardial cushion defect";
		case _5357009: return "Leukocyte poor blood preparation";
		case _5373003: return "Stress breaker";
		case _5384005: return "Excision of part of frontal cortex";
		case _5391008: return "Artificial voice rehabilitation";
		case _5393006: return "Exploration of parathyroid with mediastinal exploration by sternal split approach";
		case _5402006: return "Manipulation of thoracic artery";
		case _5407000: return "Injection of fallopian tube";
		case _5415002: return "Destruction of lesion of liver";
		case _5419008: return "Lysis of adhesions of tendon of hand";
		case _5422005: return "Amylase measurement, peritoneal fluid";
		case _5429001: return "Diagnostic procedure on nipple";
		case _5431005: return "Percutaneous transluminal angioplasty";
		case _5433008: return "Skeletal X-ray of lower limb";
		case _5446003: return "Excision of cervical rib for outlet compression syndrome with sympathectomy";
		case _5447007: return "Transfusion";
		case _5452002: return "Core needle biopsy of thymus";
		case _5456004: return "Graft of lymphatic structure";
		case _5457008: return "Serologic test for Rickettsia conorii";
		case _5460001: return "Removal of prosthesis from fallopian tube";
		case _5479003: return "Select picture audiometry";
		case _5482008: return "Serologic test for Blastomyces";
		case _5486006: return "Delayed suture of tendon of hand";
		case _5489004: return "Diagnostic procedure on radius";
		case _5506006: return "Incision and exploration of abdominal wall";
		case _5517007: return "Restoration, inlay, porcelain/ceramic, per tooth, in addition to inlay";
		case _5521000: return "Open reduction of fracture of phalanges of foot";
		case _5536002: return "Arthrodesis of carpometacarpal joint of digits, other than thumb";
		case _5545001: return "Repair of carotid body";
		case _5551006: return "Direct laryngoscopy with arytenoidectomy with operating microscope";
		case _5556001: return "Manually assisted spontaneous delivery";
		case _5570001: return "Arthrotomy for infection with exploration and drainage of carpometacarpal joint";
		case _5571002: return "Excision of lesion of aorta with end-to-end anastomosis";
		case _5572009: return "Incision of kidney pelvis";
		case _5586008: return "Aminolevulinic acid dehydratase measurement";
		case _5608002: return "Excretion measurement";
		case _5616006: return "Osteoplasty of tibia";
		case _5621009: return "Excision of malignant lesion of skin of extremities";
		case _5632009: return "Open biopsy of bronchus";
		case _5636007: return "Fistulectomy of bone";
		case _5638008: return "Carbohydrate measurement";
		case _5648005: return "Surgical repair and revision of shunt";
		case _5651003: return "Arylsulfatase A measurement";
		case _5663008: return "Phlebectomy of varicose vein of head and neck";
		case _5669007: return "Portable electroencephalogram awake and asleep with stimulation";
		case _5671007: return "Magnet extraction of foreign body from ciliary body";
		case _5687005: return "Removal of foreign body from ovary";
		case _5690004: return "Incision of seminal vesicle";
		case _5694008: return "Crisis intervention with follow-up";
		case _5721002: return "Repair of eyebrow";
		case _5722009: return "Surgical reanastomosis of colon";
		case _5726007: return "Removal of epicardial electrodes";
		case _5728008: return "Anoscopy for removal of foreign body";
		case _5731009: return "Hemosiderin, quantitative measurement";
		case _5733007: return "Fluorescent identification of anti-nuclear antibody";
		case _5738003: return "Biopsy of cul-de-sac";
		case _5745003: return "Excision ampulla of Vater with reimplantation of common duct";
		case _5760000: return "Osteoplasty of radius and ulna, shortening";
		case _5771004: return "Blepharotomy";
		case _5777000: return "Flexorplasty of elbow";
		case _5781000: return "Operation on nasal septum";
		case _5785009: return "Forensic autopsy";
		case _5787001: return "Elevation of bone fragments of orbit of skull with debridement";
		case _5789003: return "Lysis of adhesions of intestines";
		case _5796001: return "Excision of external thrombotic hemorrhoid";
		case _5806001: return "Revision of tracheostomy scar";
		case _5807005: return "Fenestration of inner ear, initial";
		case _5809008: return "Selective vagotomy with pyloroplasty and gastrostomy";
		case _5812006: return "Laboratory reporting, fax";
		case _5818005: return "Flocculation test";
		case _5821007: return "Ligation, division and complete stripping of long and short saphenous veins";
		case _5823005: return "Diagnostic radiography, left";
		case _5832007: return "Partial ostectomy of thorax, ribs or sternum";
		case _5845006: return "Emulsification procedure";
		case _5846007: return "Diagnostic radiography of toes";
		case _5857002: return "Complement mediated cytotoxicity assay";
		case _5865004: return "Open reduction of dislocation of toe";
		case _5870006: return "Tertiary closure of abdominal wall";
		case _5880005: return "Clinical examination";
		case _5892005: return "Mastoid antrotomy";
		case _5894006: return "Methyl red test";
		case _5897004: return "Removal of Scribner shunt";
		case _5902003: return "History and physical examination, complete";
		case _5925002: return "Incision and drainage of hematoma of wrist";
		case _5930003: return "Cardiac monitor removal";
		case _5947002: return "Consultation for hearing and/or speech problem";
		case _5961007: return "Division of blood vessels of cornea";
		case _5966002: return "Removal of foreign body from elbow area, deep";
		case _5971009: return "Incision and drainage of axilla";
		case _5983006: return "Repair of spermatic cord";
		case _5986003: return "Non-sensitized spontaneous sheep erythrocyte binding, E-rosette";
		case _5992009: return "Midtarsal arthrodesis, multiple";
		case _5995006: return "Gas liquid chromatography, flame photometric type";
		case _5997003: return "Drainage of cerebral subarachnoid space by aspiration";
		case _5998008: return "Radical dissection of groin";
		case _6005008: return "Transplantation of vitreous by anterior approach";
		case _6007000: return "Magnetic resonance imaging of chest";
		case _6019008: return "Endoscopy of large intestine";
		case _6025007: return "Laparoscopic appendectomy";
		case _6026008: return "Removal of coronary artery obstruction by percutaneous transluminal balloon with thrombolytic agent";
		case _6029001: return "Augmentation of outflow tract of pulmonary valve";
		case _6035001: return "Chart abstracting";
		case _6063004: return "Kanamycin measurement";
		case _6069000: return "Panniculotomy";
		case _6082008: return "Perforation of footplate";
		case _6092000: return "Aspiration of nasal sinus by puncture";
		case _6100001: return "Fenestration of stapes footplate with vein graft";
		case _6108008: return "Subdural tap through fontanel, infant, initial";
		case _6119006: return "Local destruction of lesion of bony palate";
		case _6125005: return "Change of gastrostomy tube";
		case _6126006: return "Fitzgerald factor assay";
		case _6127002: return "Diagnostic radiography of abdomen, oblique standard";
		case _6130009: return "Surgical exposure of impacted or unerupted tooth to aid eruption";
		case _6133006: return "Lymphokine assay";
		case _6143009: return "Diabetic education";
		case _6146001: return "Repair of heart septum with prosthesis";
		case _6148000: return "Chondrectomy of semilunar cartilage of knee";
		case _6157006: return "Endoscopic retrograde cholangiopancreatography with biopsy";
		case _6159009: return "Galactose measurement";
		case _6161000: return "Excision of lesion of capsule of toes";
		case _6164008: return "Osteoclasis of clavicle";
		case _6166005: return "Nephropyeloureterostomy";
		case _6177004: return "Southern blot assay";
		case _6187000: return "Repair of aneurysm with graft of common femoral artery";
		case _6188005: return "Arthrotomy of knee";
		case _6189002: return "Excision of aberrant tissue of breast";
		case _6190006: return "Colopexy";
		case _6195001: return "Transurethral drainage of prostatic abscess";
		case _6198004: return "Repair of fracture with Sofield type procedure";
		case _6200005: return "Excision of lesion of female perineum";
		case _6205000: return "Fluorescent antigen, titer";
		case _6213004: return "Prescribing corneoscleral contact lens";
		case _6221005: return "Suture of colon";
		case _6225001: return "Antibody detection, RBC, enzyme, 2 stage technique, including anti-human globulin";
		case _6226000: return "Visual rehabilitation, eye motion defect";
		case _6227009: return "Relationship psychotherapy";
		case _6231003: return "Graft of palate";
		case _6238009: return "Diagnostic radiography of sacroiliac joints";
		case _6240004: return "Operative procedure on knee";
		case _6255008: return "Resection of abdominal artery with replacement";
		case _6271008: return "Echography, immersion B-scan";
		case _6274000: return "Excision of aural glomus tumor, extended, extratemporal";
		case _6286002: return "Destructive procedure on ovaries and fallopian tubes";
		case _6289009: return "White blood cell histogram evaluation";
		case _6295005: return "Sequestrectomy of pelvic bone";
		case _6307005: return "Keratophakia";
		case _6309008: return "Fecal fat differential, quantitative";
		case _6319002: return "Beta lactamase, chromogenic cephalosporin susceptibility test";
		case _6337001: return "Ligation of aortic arch";
		case _6339003: return "Conditioning play audiometry";
		case _6343004: return "Forensic bite mark comparison technique";
		case _6353003: return "Mitsuda reaction to lepromin";
		case _6354009: return "Sedimentation rate, Westergren";
		case _6355005: return "Removal of internal fixation device of radius";
		case _6358007: return "Capsulorrhaphy of joint";
		case _6361008: return "Anesthesia for popliteal thromboendarterectomy";
		case _6363006: return "Dilation of lacrimal punctum with irrigation";
		case _6370006: return "Chemosurgery of stomach lesion";
		case _6384001: return "Removal of device from digestive system";
		case _6385000: return "Exploration of disc space";
		case _6388003: return "TdT stain";
		case _6396008: return "Galactokinase measurement";
		case _6397004: return "Muscular strength development exercise";
		case _6399001: return "Division of arteriovenous fistula with ligation";
		case _6402000: return "Excision of common bile duct";
		case _6403005: return "Lengthening of muscle of hand";
		case _6419003: return "Excision of tumor from elbow area, deep, subfascial";
		case _6429005: return "Heteroautogenous transplantation";
		case _6433003: return "Closed heart valvotomy of mitral valve";
		case _6434009: return "Seminal fluid detection";
		case _6438007: return "Exploration of ciliary body";
		case _6439004: return "Destruction of lesion of peripheral nerve";
		case _6443000: return "Pontic, porcelain fused to predominantly base metal";
		case _6444006: return "Enlargement of eye socket";
		case _6465000: return "Arthrotomy of glenohumeral joint for infection with drainage";
		case _6466004: return "Administration of Rh immune globulin";
		case _6470007: return "Laparoamnioscopy";
		case _6473009: return "Suture of old obstetrical laceration of uterus";
		case _6480006: return "Urinary bladder residual urine study";
		case _6486000: return "Curettage of sclera";
		case _6487009: return "Hand tendon pulley reconstruction with tendon prosthesis";
		case _6491004: return "Protein S, free assay";
		case _6499002: return "Tsuge operation on finger for macrodactyly repair";
		case _6502003: return "Complete lower denture";
		case _6506000: return "Placing a patient on a bedpan";
		case _6519001: return "Operation on multiple extraocular muscles with temporary detachment from globe";
		case _6521006: return "Polytomography";
		case _6527005: return "Uchida fimbriectomy with tubal ligation by endoscopy";
		case _6535008: return "Excision of cyst of hand";
		case _6536009: return "Implantation of tricuspid valve with tissue graft";
		case _6543003: return "Complicated catheterization of bladder";
		case _6547002: return "Repair with closure of non-surgical wound";
		case _6555009: return "Insertion of infusion pump beneath skin";
		case _6556005: return "Reticulin antibody measurement";
		case _6562000: return "Destruction of lesion of tongue";
		case _6563005: return "Transposition of muscle of hand";
		case _6567006: return "Pulmonary valve commissurotomy by transvenous balloon method";
		case _6568001: return "Diagnostic procedure on eyelid";
		case _6585004: return "Closed reduction of fracture of tarsal or metatarsal";
		case _6589005: return "Antibody titration, high protein";
		case _6601003: return "Removal of foreign body from skin of axilla";
		case _6614002: return "Antibody to single stranded DNA measurement";
		case _6615001: return "Electroretinography with medical evaluation";
		case _6622009: return "Add clasp to existing partial denture";
		case _6634001: return "Destruction of hemorrhoids, internal";
		case _6639006: return "Replacement of obstructed valve in shunt system";
		case _6650009: return "Radionuclide lacrimal flow study";
		case _6656003: return "Acoustic stimulation test";
		case _6657007: return "Maintenance drug therapy for mental disorder";
		case _6658002: return "Removal of foreign body from alveolus";
		case _6661001: return "King-Steelquist hindquarter operation";
		case _6665005: return "Restoration, crown, porcelain fused to noble metal";
		case _6668007: return "Fibrinogen assay, quantitative";
		case _6670003: return "Closure of external fistula of trachea";

		case NULL: return "null";
		}
		return null;
	}

}

