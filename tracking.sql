CREATE TABLE IF NOT EXISTS `tracking` (
  `session_id` varchar(255) NOT NULL,
  `method` varchar(255) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  `remote_addr` varchar(255) DEFAULT NULL,
  `remote_host` varchar(255) DEFAULT NULL,
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `process` varchar(255) DEFAULT NULL,
  `command_id` varchar(255) DEFAULT NULL,
  `simulator_type` varchar(20) DEFAULT NULL,
  KEY `tracking_index` (`session_id`)
)
